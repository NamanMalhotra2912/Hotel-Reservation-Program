package HotelReservation;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
public class CheapestHotel {

	public static int chargesforLakeWood = 110;
	public static int chargesforBridgeWood = 160;
	public static int chargesforRidgeWood = 220;
	
	Date d1;
	Date d2;
	
	public int calculatePeriod(LocalDate d1, LocalDate d2) {
		
		Period period = Period.between(d1, d2);
		System.out.println("Daration of stay in hotel is : "+period);
		return 0;
	}
	
	public static void main(String[] args) {
		
		CheapestHotel hotel = new CheapestHotel();
		LocalDate d1 = LocalDate.parse("2020-09-10");
		LocalDate d2 = LocalDate.parse("2020-09-11");
		hotel.calculatePeriod(d1, d2);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(chargesforLakeWood);
		arrayList.add(chargesforBridgeWood);
		arrayList.add(chargesforRidgeWood);
		
		if ( (chargesforLakeWood < chargesforBridgeWood) && (chargesforLakeWood < chargesforRidgeWood) ) {
			System.out.println("LakeWood is the cheap hotel");
		}
		else if ( (chargesforBridgeWood < chargesforLakeWood) && (chargesforBridgeWood < chargesforRidgeWood) ) {
			System.out.println("BridgeWood is the cheap hotel");
		}
		else {
			System.out.println("RidgeWood is the cheap hotel");
		}
		
	}

}
