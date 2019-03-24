package kr.ac.kookmin.cs.opp.ch5;

interface phoneinterface {
	final int TIMEOUT = 10000;
	void sendCall();
	void receivecall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
}// 추상클래스는 맴버변수 가질수있다. 필드값 
interface MobilePhoneInterface extends phoneinterface {
	void sendSMS();
	void receiveSMS();
}
interface MP3interface {
	public void play();
	public void stop();
}
class PDA {
	public int calculate(int x, int y) {
		return x+y;
	}
}
class SmartPhone extends PDA implements MobilePhoneInterface, MP3interface  {
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	@Override
	public void receivecall() {
		System.out.println("전화가 왔습니다.");
	}
	public void flash( ) {System.out.println("전화기에 불이 켜졌습니다"); }
	@Override
	public void play() {
		System.out.println("음악 연주합니다.");
		
	}
	@Override
	public void stop() {
		System.out.println("음악 중단합니다.");
		
	}
	@Override
	public void sendSMS() {
		System.out.println("문자갑니다.");
		
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자왔어요");
		
	}
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3 + 5 = " + phone.calculate(3,5));
		phone.receivecall();
		phone.schedule();
		phone.flash();

	}

}
