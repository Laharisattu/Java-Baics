package Threads;

public class Testjoinmethod1 {
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {System.out.println(e);}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testjoinmethod1 t1=new Testjoinmethod1();
		Testjoinmethod1 t2=new Testjoinmethod1();
		Testjoinmethod1 t3=new Testjoinmethod1();
		t1.start();
		try {
			t1.join();
		}catch(Exception e){System.out.println(e);}
		t2.start();
		t3.start();
	}

}
