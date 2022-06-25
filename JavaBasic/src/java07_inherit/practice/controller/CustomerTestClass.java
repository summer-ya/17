package java07_inherit.practice.controller;

public class CustomerTestClass {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCstmName("이순신");
		c.setCstmID(10010);
		c.bonusPoint = 1000;
		
		VIPCustomer vc = new VIPCustomer();
		vc.setCstmName("김유신");
		vc.setCstmID(10020);
		vc.bonusPoint = 10000;
		
		c.showCstmInfo();
		vc.showCstmInfo();
		
		int price = 10000;
		System.out.println(c.cstmName + "님이 지불해야 하는 금액은 " + c.calcPrice(price)+"원입니다");
		System.out.println(vc.cstmName + "님이 지불해야 하는 금액은 " + vc.calcPrice(price)+"원입니다");
		System.out.println(c.cstmName + "님의 보너스 포인트는 " + c.bonusPoint+"원입니다");
		System.out.println(vc.cstmName + "님의 보너스 포인트는 " + vc.bonusPoint+"원입니다");
		
	}

}
