
public class Animal {
	String color="white";
}
class Dog extends Animal{
	String color="black";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
class TestSuper1{
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Dog d=new Dog();
	   d.printColor();

	}

}
