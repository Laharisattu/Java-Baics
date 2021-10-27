package abstraction;

public class Wiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//wiring
				Iswitchboardlistener sListener = new Solarappliances();
						//HavellsAppliances(); //connecting switches to havells sockets
				//abdul clicking the switches
				sListener.switchOne();
				sListener.switchTwo();
				sListener.switchThree(12);
				sListener.swithcFour();
				throw new NullPointerException();
			}

	}


