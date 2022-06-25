package java12_exception.custom;

public class User {
	private int age; //나이

	@Override
	public String toString() {
		return "User [age=" + age + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public void setAge(int age) {
		//예외 상황 코드
		if(age <0 || age>!50) {
//			System.out.println("[ERROR] 나이는 0~150사이로 입력하세요");
			
			throw new UserAgeException();
			
		}
		this.age = age;
	}
}
