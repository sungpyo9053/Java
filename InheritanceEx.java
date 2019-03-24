package kr.ac.kookmin.cs.opp.ch5;

class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight =weight;
	}
	public int getWeigth() {
		return weight;
	}
}

class Student extends Person {
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175; // 상속을 받기도 하고 같은 패키지기도 하고
		setWeight(99);//
	}
}
public class InheritanceEx {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}

}
