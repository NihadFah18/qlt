package serviceParking;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestServiceParkingFare {
	private static ServiceParkingFare spf;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		spf=new ServiceParkingFare();
	}

	@Test
	void testCalculateBikeFare2Hours() {
		//arrang
		LocalDateTime inTime=LocalDateTime.now();
		LocalDateTime outTime=LocalDateTime.now().plusHours(2);
		//act
		double fare=spf.calculateFare(inTime,outTime,TypeVehicule.BIKE);
		//assert
		assertEquals(3, fare);
	}
	@Test
	void testCalculateCarFare2Hours() {
		//arrang
		LocalDateTime inTime=LocalDateTime.now();
		LocalDateTime outTime=LocalDateTime.now().plusHours(2);
		//act
		double fare=spf.calculateFare(inTime,outTime,TypeVehicule.CAR);
		//assert
		assertEquals(6, fare);
	}
	
	@Test
	void testCalculateTruckFare2Hours() {
		//arrang
		LocalDateTime inTime=LocalDateTime.now();
		LocalDateTime outTime=LocalDateTime.now().plusHours(2);
		//act
		double fare=spf.calculateFare(inTime,outTime,TypeVehicule.TRUCK);
		//assert
		assertEquals(10, fare);
	}
	@Test
	void testCalculateTruckFareUnder30Minutes() {
		//arrang
		LocalDateTime inTime=LocalDateTime.now();
		LocalDateTime outTime=LocalDateTime.now().plusMinutes(29);
		//act
		double fare=spf.calculateFare(inTime,outTime,TypeVehicule.TRUCK);
		//assert
		assertEquals(0, fare);
	}
	@Test
	void testCalculateTruckFareUpper30Minutes() {
		//arrang
		LocalDateTime inTime=LocalDateTime.now();
		LocalDateTime outTime=LocalDateTime.now().plusMinutes(45);
		//act
		double fare=spf.calculateFare(inTime,outTime,TypeVehicule.TRUCK);
		//assert
		assertEquals(3.75, fare);
	}
	@Test
	void testCalculateTruckFare12HoursDiscount() {
		//arrang
		LocalDateTime inTime=LocalDateTime.now();
		LocalDateTime outTime=LocalDateTime.now().plusHours(12);
		//act
		double fare=spf.calculateFare(inTime,outTime,TypeVehicule.TRUCK);
		//assert
		assertEquals(57, fare);
	}
	@Test
	void testCalculateTruckFare24HoursDiscount() {
		//arrang
		LocalDateTime inTime=LocalDateTime.now();
		LocalDateTime outTime=LocalDateTime.now().plusHours(24);
		//act
		double fare=spf.calculateFare(inTime,outTime,TypeVehicule.TRUCK);
		//assert
		assertEquals(108, fare);
	}
	

}
