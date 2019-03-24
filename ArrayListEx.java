package kr.ac.kookmin.cs.opp.ch5;
import java.util.*;
public class ArrayListEx {
	

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i =0; i<4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = scanner.next();
			a.add(s); // a 객체에 차례로 넣어줌.
		}
		for (int i =0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.print(name + " ");
		}
		int longestindex = 0;
		for (int i =0; i<a.size(); i++) {
			if (a.get(longestindex).length() < a.get(i).length()) {
				longestindex = i;
			}
			System.out.println(" \n 가장 긴 이름은 : " + a.get(longestindex));
		}
		scanner.close();
	}

}
