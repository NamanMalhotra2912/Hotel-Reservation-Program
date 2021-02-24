package HotelReservation;
public class AddHotel {

	private int chargesforLakeWood = 110;
	private int chargesforBridgeWood = 160;
	private int chargesforRidgeWood = 220;
	
	public void hotelLakeWood () {
		
		System.out.println("Hotel LakeWood ");
		System.out.println("Charges for Regular Customers are : "+ chargesforLakeWood+"$\n");
	}
	
	public void hotelBridgeWood () {
		
		System.out.println("Hotel BridgeWood ");
		System.out.println("Charges for Regular Customers are : "+chargesforBridgeWood+"$\n");
	}
	
	public void hotelRidgeWood () {
		
		System.out.println("Hotel RidgeWood ");
		System.out.println("Charges for Regular Customers are : "+chargesforRidgeWood+"$\n");
	}
	
	public static void main(String[] args) {
		
		AddHotel addhotel = new AddHotel();
		addhotel.hotelLakeWood();
		addhotel.hotelBridgeWood();
		addhotel.hotelRidgeWood();
	}

}
