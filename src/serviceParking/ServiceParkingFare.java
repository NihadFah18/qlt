package serviceParking;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ServiceParkingFare {
	
	private static final double BIKE_RATE=1.5;
	private static final double CAR_RATE=3;
	private static final double TRUCK_RATE=5;
	
	public double calculateFare(LocalDateTime inTime, 
								LocalDateTime outTime, 
								TypeVehicule vehicule) {
		//double duration=inTime.until(outTime, ChronoUnit.HOURS);
		double duration=inTime.until(outTime, ChronoUnit.MINUTES);
		double fare;
		if(duration<30)
			return 0.0;
		fare=switch (vehicule) {
						case BIKE -> (duration*BIKE_RATE)/60;
						case CAR ->(duration*CAR_RATE)/60;
						case TRUCK ->(duration*TRUCK_RATE)/60;
						default -> -1;
						};
						
	    if(duration>= 720 && duration <1440)		// 60*12=720 et 24*60=1440
	    	fare=fare-fare*0.05;
	    if(duration>=1440)
	    	fare=fare-fare*0.1;
		
	    return fare;
	    
	    
	    
	    
		
		/*return switch (vehicule) {
				case BIKE -> (duration*BIKE_RATE)/60;
				case CAR ->(duration*CAR_RATE)/60;
				case TRUCK ->(duration*TRUCK_RATE)/60;
				default -> -1;
		};*
		
		
		
		/*if (vehicule.equals(TypeVehicule.BIKE))
		{			
			return duration*BIKE_RATE;
		}
		
		if (vehicule.equals(TypeVehicule.CAR))
		{
			return duration*CAR_RATE;
		}
		if (vehicule.equals(TypeVehicule.TRUCK))
		{
			return duration*TRUCK_RATE;
		}
		
		return -1;*/
	}

}
