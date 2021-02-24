package HotelReservation;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;

public class CheapestHotelForDateRange {
	
	public static int chargesforLakeWoodOnWeekDay = 110;
	public static int chargesforLakeWoodOnWeekEnd = 90;
	public static int chargesforBridgeWoodOnWeekDay = 150;
	public static int chargesforBridgeWoodOnWeekEnd = 50;
	public static int chargesforRidgeWoodOnWeekDay = 220;
	public static int chargesforRidgeWoodOnWeekEnd = 150;
	
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
		LocalDate d2 = LocalDate.parse("2020-09-12");
		hotel.calculatePeriod(d1, d2);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(chargesforLakeWoodOnWeekDay);
		arrayList.add(chargesforLakeWoodOnWeekEnd);
		arrayList.add(chargesforBridgeWoodOnWeekDay);
		arrayList.add(chargesforBridgeWoodOnWeekEnd);
		arrayList.add(chargesforRidgeWoodOnWeekDay);
		arrayList.add(chargesforRidgeWoodOnWeekEnd);
		
		if ( (chargesforLakeWoodOnWeekDay < chargesforBridgeWoodOnWeekDay) && (chargesforLakeWoodOnWeekDay < chargesforRidgeWoodOnWeekDay) ) {
			System.out.println("LakeWood is the cheap hotel for WeekDays");
		}
		else if ( (chargesforBridgeWoodOnWeekDay < chargesforLakeWoodOnWeekDay) && (chargesforBridgeWoodOnWeekDay < chargesforRidgeWoodOnWeekDay) ) {
			System.out.println("BridgeWood is the cheap hotel for WeekDays");
			}
		else {
			System.out.println("RidgeWood is the cheap hotel for WeekDays");
		}
		
		
		if ( ( chargesforLakeWoodOnWeekEnd < chargesforBridgeWoodOnWeekEnd) && (chargesforLakeWoodOnWeekEnd < chargesforRidgeWoodOnWeekEnd) ) {
			System.out.println("LakeWood is the cheap hotel for WeekEnd");
		}
		else if( (chargesforBridgeWoodOnWeekEnd < chargesforLakeWoodOnWeekEnd) && (chargesforBridgeWoodOnWeekEnd < chargesforRidgeWoodOnWeekEnd) ) {
			System.out.println("BridgeWood is the cheap hotel for WeekEnd");
		}
		else {
			System.out.println("RidgeWood is the cheap hotel for WeekEnd");
		}
		
	}

}
