public class Car {
		
	String name;
	String brand;
	int km;
	int doors;
	String color;
	String insurance;

	Car(String name, String brand){
		this.name = name;
		this.brand = brand;
	}

        public String color(String name){
		if(name.equals("BMW")) this.color = "RED LIGHT";	
	}

}
