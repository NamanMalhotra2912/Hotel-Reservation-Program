package HotelReservation;

public class SpecialRatesForRewardCustomer {

	public static int chargesForLakeWoodRewardCustomersOnWeekDays = 80;
	public static int chargesForLakeWoodRewardCustomersOnWeekEnd = 80;
	
	public static int chargesForBridgeWoodRewardCustomersOnWeekDays = 110;
	public static int chargesForBridgeWoodRewardCustomersOnWeekEnd = 50;
	
	public static int chargesForRidgeWoodRewardCustomersOnWeekDays = 100;
	public static int chargesForRidgeWoodRewardCustomersOnWeekEnd = 40;
	
	public void hotelLakeWood () {
		
		System.out.println("Hotel LakeWood ");
		System.out.println("Charges for Reward Customers on weekdays are : "+ chargesForBridgeWoodRewardCustomersOnWeekDays+"$");
		System.out.println("Charges for Reward Customers on weekends are : "+ chargesForBridgeWoodRewardCustomersOnWeekEnd+"$\n");
	}
	
	public void hotelBridgeWood () {
		
		System.out.println("Hotel BridgeWood ");
		System.out.println("Charges for Reward Customers on weekdays are : "+chargesForBridgeWoodRewardCustomersOnWeekDays+"$");
		System.out.println("Charges for Reward Customers on weekends are : "+chargesForBridgeWoodRewardCustomersOnWeekEnd+"$\n");
	}
	
	public void hotelRidgeWood () {
		
		System.out.println("Hotel RidgeWood ");
		System.out.println("Charges for Reward Customers on weekdays are : "+chargesForRidgeWoodRewardCustomersOnWeekDays+"$");
		System.out.println("Charges for Reward Customers on weekends are : "+chargesForRidgeWoodRewardCustomersOnWeekEnd+"$\n");
	}
	
	public static void main(String[] args) {

		SpecialRatesForRewardCustomer rates = new SpecialRatesForRewardCustomer();
		rates.hotelLakeWood();
		rates.hotelBridgeWood();
		rates.hotelRidgeWood();
		
	}

}
