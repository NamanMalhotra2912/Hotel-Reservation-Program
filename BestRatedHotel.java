package HotelReservation;

public class BestRatedHotel {
	
	public static int LakeWoodRating = 3;
	public static int BridgeWoodRating = 4;
	public static int RidgeWoodRating = 5;
	
	public static int chargesforLakeWoodOnWeekDay = 110;
	public static int chargesforLakeWoodOnWeekEnd = 90;
	public static int chargesforBridgeWoodOnWeekDay = 150;
	public static int chargesforBridgeWoodOnWeekEnd = 50;
	public static int chargesforRidgeWoodOnWeekDay = 220;
	public static int chargesforRidgeWoodOnWeekEnd = 150;
	
	public static int charges=0;

	public String bestRatingHotel() {
		if ( (LakeWoodRating > BridgeWoodRating) && (LakeWoodRating > RidgeWoodRating) ) {
			charges = chargesforLakeWoodOnWeekDay + chargesforLakeWoodOnWeekEnd;
			System.out.println("LakeWood is the best rated hotel");
			System.out.println("Total fare will be : "+charges);
		}
		else if ( (BridgeWoodRating > LakeWoodRating) && (BridgeWoodRating > RidgeWoodRating) ) {
			charges = chargesforBridgeWoodOnWeekDay + chargesforBridgeWoodOnWeekEnd;
			System.out.println("BridgeWood is the best rated hotel");
			System.out.println("Total fare will be : "+charges);
		}
		else {
			charges = chargesforRidgeWoodOnWeekDay + chargesforRidgeWoodOnWeekEnd;
			System.out.println("RidgeWood is the best rated hotel");
			System.out.println("Total fare will be : "+charges);
		}
		return "";
	}
	
	public static void main(String[] args) {
		
		BestRatedHotel hotel = new BestRatedHotel();
		hotel.bestRatingHotel();
		
	}

}
