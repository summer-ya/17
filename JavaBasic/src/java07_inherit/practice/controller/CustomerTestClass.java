package java07_inherit.practice.controller;

public class CustomerTestClass {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCstmName("�̼���");
		c.setCstmID(10010);
		c.bonusPoint = 1000;
		
		VIPCustomer vc = new VIPCustomer();
		vc.setCstmName("������");
		vc.setCstmID(10020);
		vc.bonusPoint = 10000;
		
		c.showCstmInfo();
		vc.showCstmInfo();
		
		int price = 10000;
		System.out.println(c.cstmName + "���� �����ؾ� �ϴ� �ݾ��� " + c.calcPrice(price)+"���Դϴ�");
		System.out.println(vc.cstmName + "���� �����ؾ� �ϴ� �ݾ��� " + vc.calcPrice(price)+"���Դϴ�");
		System.out.println(c.cstmName + "���� ���ʽ� ����Ʈ�� " + c.bonusPoint+"���Դϴ�");
		System.out.println(vc.cstmName + "���� ���ʽ� ����Ʈ�� " + vc.bonusPoint+"���Դϴ�");
		
	}

}
