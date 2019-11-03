package oopImheritenance;

public class Inheritance {
	String carName;
	String carBrand;
	int carModule;
	boolean isAvailibale;
	
	public void carStart() {
		System.out.println("car start ");
	}
	public void carstop() {
		System.out.println("car stop");
	}
	public String carInfo(String carName,String carBrand) {
		
		String carDetails =carName +""+carBrand;
		System.out.println(carDetails );
		return carDetails;
		
	}

}
