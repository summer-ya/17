package java08_abstract;

public class Person {

	// 필드 작성
	protected String name;  //멤버필드
	protected String company;

	public Person() {           //생성자로 입력
		System.out.println("하아아아아아");
	}

	public Person(String name, String company) {
		this.name = name;
		this.company = company;
	}



	public void introduce() {
		System.out.println("제 이름은  : " + this.name + "입니다.");
		System.out.println("회사 이름은 : " + this.company + "입니다.");

	}

}
