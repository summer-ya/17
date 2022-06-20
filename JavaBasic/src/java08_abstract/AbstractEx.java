package java08_abstract;

public class AbstractEx {

	//super(상위) class 정의_사원 : 추상 클래스
	abstract class Employee {
		String name;
		String dept;


		public Employee() {

		}
		public Employee(String name, String dept) {
			this.name = name;
			this.dept = dept;
		}


		// 급여를 계산한다.( 추상 클래스)
		public abstract double payCheck();

		public void printEmployee() {
			System.out.printf("name : %s%n", name);
			System.out.printf("dept : %s%n", dept);
		}
	}

}
