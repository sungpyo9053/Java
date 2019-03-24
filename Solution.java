package kr.ac.kookmin.cs.oop.ch2;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("");
		int score = scanner.nextInt();
		if(score >= 80) 
			grade = 'A';
		else if (score <80 && score >=60) 
			grade = 'B';
		else if (score <60 && score>=50)
			grade = 'C';
		else 
			grade = 'D';
			
		System.out.println(grade);
		
		scanner.close();
	}
	
}

