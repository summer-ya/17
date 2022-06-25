package java07_inherit.practice.controller;

public class VIPCustomer extends Customer {          //customer class ��ӹ���
	private int agentID;              // ���� ���� �Ƶ�
	double saleRatio;                
	
	public VIPCustomer() {       //����Ʈ ������
		cstmGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {        // �޼��� �������̵�
		bonusPoint += price*bonusRatio;
		return price - (int)(price * saleRatio);
	}
	public int getAgentID() {
		return agentID;
	}

}
