package java07_inherit.practice.controller;

public class VIPCustomer extends Customer {          //customer class 상속받음
	private int agentID;              // 전담 상담원 아디
	double saleRatio;                
	
	public VIPCustomer() {       //디폴트 생성자
		cstmGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {        // 메서드 오버라이딩
		bonusPoint += price*bonusRatio;
		return price - (int)(price * saleRatio);
	}
	public int getAgentID() {
		return agentID;
	}

}
