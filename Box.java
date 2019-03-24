package kr.ac.kookmin.cs.opp.ch5;

public class Box<T> {
	private T type;
	
	public T getype( ) {
		return type;
	}
	public void setType(T type) {
		this.type = type;
	}

	public static void main(String[] args) {
		Box<String> boxString = new Box<String>(); // <> 변수타입을 마음대로 바꿀수 있따. 별거 없다.
		Box<Integer> boxInteger = new Box<Integer>(); // <> 변수는 반드시 참조형 변수값만 가능하다
		
		boxString.setType("String generic");
		boxInteger.setType(123);
	}

}
