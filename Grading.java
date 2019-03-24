package kr.ac.kookmin.cs.oop.ch2;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100)");
		int score = scanner.nextInt();
		if(score >= 90) 
			grade = 'A';
		if (score >= 80) //else 만약 다 if 로 바꾼다면 학점은 D로 나옴 왜일까
			grade = 'b';
		else if (score >= 70)
			grade = 'c';
		else if  (score >= 60)
			grade = 'd';
		else 
			grade = 'f';
			
		System.out.println("학점은" + grade + "입니다.");
		
		scanner.close();
	}

}
