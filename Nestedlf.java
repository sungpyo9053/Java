package kr.ac.kookmin.cs.oop.ch2;

public class LogicalOperator {

	public static void main(String[] args) {
		
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println( 3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		
		//비교 연선과 논리 연산 복합
		
		System.out.println((3 > 2) && (3 > 4));
		System.out.println((3 != 2) && (-1 > 0));

	}

}
