package kr.ac.kookmin.cs.opp.ch5;
class Shape{
 
	public Shape next;
	public Shape() { next = null; }
	
	public void draw() {
		System.out.println("Shape");
	}
	@Override
	public String toString() {
		return "Shape";
	}

}
class Line extends Shape {
	
	public void draw() {
		System.out.println("Line");
	}
	@Override
	public String toString() {
		return "Shape";
	}

}
class Rect extends Shape {
	public void draw() {
		System.out.println("Rect"); 
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("Cicle");
	}
}
public class MethodOverridingEx {
	static void paint(Shape p) {
		
	}

	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}
