package java07_inherit.practice.controller;

public class Customer {
		
		protected int cstmID;           
		protected String cstmName;
		protected String cstmGrade;
		int bonusPoint;
		double bonusRatio;
		
		
		public Customer() {                    // ����Ʈ ������
			cstmGrade = "silver";              // �� ��� ����Ʈ
			bonusRatio = 0.01;                 // ���ʽ����� ����Ʈ
	}
		
		public int calcPrice(int price) {
			bonusPoint += price * bonusRatio;
			return price;
		}
		public void showCstmInfo() {
			System.out.println(cstmName + " ���� ����� " + cstmGrade + " �̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�");
		}

		public int getCstmID() {
			return cstmID;
		}

		public void setCstmID(int cstmID) {
			this.cstmID = cstmID;
		}

		public String getCstmName() {
			return cstmName;
		}

		public void setCstmName(String cstmName) {
			this.cstmName = cstmName;
		}

		public String getCstmGrade() {
			return cstmGrade;
		}

		public void setCstmGrade(String cstmGrade) {
			this.cstmGrade = cstmGrade;
		}
		

}
