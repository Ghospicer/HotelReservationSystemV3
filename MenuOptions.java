
public enum MenuOptions {
	
	SINGLE("Room Type: Single, Daily Cost: 100, Room Size: 15, Has Bath: false."),
	DOUBLE("Room Type: Double, Daily Cost: 180, Room Size: 30, Has Bath: false."),
	CLUB("Room Type: Club, Daily Cost: 250, Room Size: 45, Has Bath: true."),
	FAMILY("Room Type: Family, Daily Cost: 400, Room Size: 50, Has Bath: false."),
	FAMILYWITHVIEW("Room Type: Family With View, Daily Cost: 450, Room Size: 50, Has Bath: true."),
	SUITE("Room Type: Suite, Daily Cost: 650, Room Size: 80, Has Bath: true.");
	
	MenuOptions(String roomInfo){
		this.roomInfo = roomInfo;
		
	}
	
	public String roomInfo;
	
	public String RoomInfo(){
		return roomInfo;
	}



}



