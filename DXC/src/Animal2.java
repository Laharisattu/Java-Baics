
public class Animal2 {
	Animal2()
	{System.out.println("animal2 is created");}
}
class Dog extends Animal2{
	Dog(){
		super();
		System.out.println("dog is created");
	}
	
	}
class TestSuper3{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();

	}

}
