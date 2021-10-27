package ecommerce;

public class Testshopping {
public static void main(String[] args) {
		
		customer customerAbdul = new customer();
		customerAbdul.walkin();
		Security maxSecurity = new Security();
		
		boolean iscustomer = maxSecurity.scan(customerAbdul);
		if(iscustomer) {
			customerAbdul.shop();
		}
		
		customerAbdul.checkout();
	}

}
