package kr.ac.kookmin.cs.opp.ch5;

class Person1 {
	
}
class Student2 extends Person1{}
class Resercher extends Person1{}
class Professor extends Resercher{}


public class InstanceOfEx {
	static void print(Person1 p) {
		if (p instanceof Person1)
			System.out.print("Person");
		
		if (p instanceof Student2) 
			System.out.print("Student");

		if (p instanceof Resercher)
			System.out.print("Resercher");
		
		if (p instanceof Professor)
			System.out.print("Pfofessor");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student() -> \t"); print(new Student2());
		System.out.print("new Resercher() > \t"); print(new Resercher());
		System.out.print("new Professor() -> \t"); print(new Professor());
	}
}
