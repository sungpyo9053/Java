package kr.ac.kookmin.cs.opp.ch5;
import java.util.*;
public class IteratorEx {
	public static void main(String[] args) {
		List<Integer> v = new ArrayList<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		int sum =0;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("���Ϳ� �ִ� ���� ��  : " +sum);
	}

}
