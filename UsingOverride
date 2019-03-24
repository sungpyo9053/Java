package kr.ac.kookmin.cs.opp.ch5;

public class UsingOverride {
	@Override
	public String toString() {
		return "Shape";
	}


	public static void main(String[] args) {
		Shape  start, last, obj;
		
		
		start = new Line();
		last = start;
		obj = new Rect();
		last.next = obj;
		last = obj;
		obj = new Line();
		last.next = obj;
		last = obj;
		obj = new Circle();
		last.next = obj;
		
		Shape p =start;
		while(p != null) {
			p.draw();
			p = p.next;
		}

	}

}
