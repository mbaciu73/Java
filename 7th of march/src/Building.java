public class Building {
	//data attributes
	double size;//unit in meters squared
	String address;
	boolean residential_use;
	//default constructor
	public Building() {
		this.size=0;
		this.address="Somewhere";
		this.residential_use=true;
	}
	//another constructor method
	public Building(double b_size) {
		this.size=b_size;
		this.address="Somewhere";
		this.residential_use=true;
	}
	
	
	
	
	
	
	public static void main(String[]args) {
		//create object
		Building house = new Building();
		Building your_house=new Building(150.5);
		//overwrite house object
		house.size=(float)175.5;
		house.address="O'Connell Street";
		house.residential_use=true;
		System.out.println("House 1 size is "+house.size);
		System.out.println("House 1 address is "+house.address);
		System.out.println("House 1 residential status is "+house.residential_use);
		
		System.out.println("House 2 size is "+your_house.size);
		System.out.println("House 2 address is "+your_house.address);
		System.out.println("House 2 residential status is "+your_house.residential_use);
	}
	

}
