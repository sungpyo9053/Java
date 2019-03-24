package kr.ac.kookmin.cs.opp.ch5;

public class CustomException extends RuntimeException {
	public CustomException(String message) {
		super(message);
	}
	public void nullPointException() {
		String name = null;
	}
	public void throwCustomException() throws CustomException{
		try {
			nullPointException();
		} catch (NullPointerException npe) {
			throw new CustomException("converting NPE to Custom Exception");
		//	return; //catch가 실행됐으면 무조건 어떤상황도 실행된다
		} finally { // 무조건 실행됌 종료하는 코드가 있어도 이건 실행되고 끝남. 
			System.out.println("Finally block execution"); // 컴퓨터 자원
		}
		System.out.println("하하"); //이건 실행안됌 throw는 실행을 종료시키기 때문에 finally 만 실행시키고 종료시킴
	}
		
}
