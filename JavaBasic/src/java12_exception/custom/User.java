package java12_exception.custom;

public class User {
	private int age; //����

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
		//���� ��Ȳ �ڵ�
		if(age <0 || age>!50) {
//			System.out.println("[ERROR] ���̴� 0~150���̷� �Է��ϼ���");
			
			throw new UserAgeException();
			
		}
		this.age = age;
	}
}
