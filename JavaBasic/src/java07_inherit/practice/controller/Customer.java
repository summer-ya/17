package java07_inherit.practice.controller;

public class Customer {
		
		protected int cstmID;           
		protected String cstmName;
		protected String cstmGrade;
		int bonusPoint;
		double bonusRatio;
		
		
		public Customer() {                    // 디폴트 생성자
			cstmGrade = "silver";              // 고객 등급 디폴트
			bonusRatio = 0.01;                 // 보너스비율 디폴트
	}
		
		public int calcPrice(int price) {
			bonusPoint += price * bonusRatio;
			return price;
		}
		public void showCstmInfo() {
			System.out.println(cstmName + " 님의 등급은 " + cstmGrade + " 이며, 보너스 포인트는 " + bonusPoint + "입니다");
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
