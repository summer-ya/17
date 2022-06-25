package java08_abstract;

public class CarTest {
	public static void main(String[] args) {
		Car1 c1 = new Car1();
		c1.color = "white";
		c1.gearType = "auto";
		
		Car1 c2 = new Car1("white", "auto", 4); 
		
		System.out.println("c1ÀÇ colo=" + c1.color + ", gearType=");
		System.out.println("c2ÀÇ color=" + c2.color+", gearType=" +c2.gearType+", door="+c2.door);
	}

}
