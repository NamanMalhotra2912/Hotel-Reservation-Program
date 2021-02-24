package HotelReservation;
import java.util.ArrayList;

public class WeekdayWeekendRates {
	
	public static int chargesforLakeWoodOnWeekDay = 110;
	public static int chargesforLakeWoodOnWeekEnd = 90;
	public static int chargesforBridgeWoodOnWeekDay = 150;
	public static int chargesforBridgeWoodOnWeekEnd = 50;
	public static int chargesforRidgeWoodOnWeekDay = 220;
	public static int chargesforRidgeWoodOnWeekEnd = 150;
	
	public void lakeWoodHotelCharges() {
		System.out.println("LakeWood Hotel ");
		System.out.println("Charges for WeekDays are : "+chargesforLakeWoodOnWeekDay+"$");
		System.out.println("Charges for WeekEnd are : "+chargesforLakeWoodOnWeekEnd+"$"+"\n");
	}
	
	public void BridgeWoodHotelCharges() {
		System.out.println("BridgeWood Hotel ");
		System.out.println("Charges for WeekDays are : "+chargesforBridgeWoodOnWeekDay+"$");
		System.out.println("Charges for WeekEnd are : "+chargesforBridgeWoodOnWeekEnd+"$"+"\n");
	}
	
	public void RidgeWoodHotelCharges() {
		System.out.println("LakeWood Hotel ");
		System.out.println("Charges for WeekDays are : "+chargesforRidgeWoodOnWeekDay+"$");
		System.out.println("Charges for WeekEnd are : "+chargesforRidgeWoodOnWeekEnd+"$"+"\n");
	}
	
	public static void main(String[] args) {
		
		WeekdayWeekendRates rates = new WeekdayWeekendRates();
		rates.lakeWoodHotelCharges();
		rates.BridgeWoodHotelCharges();
		rates.RidgeWoodHotelCharges();
		
	}

}
