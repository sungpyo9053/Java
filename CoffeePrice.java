package kr.ac.kookmin.cs.oop.ch2;
import java.util.Scanner;
public class CoffeePrice {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		int price = 0;
		System.out.print("무슨커피드릴까요?");
		String order = scanner.next();
		
		switch(order) {/////if 문으로 바꿔보기//// if (order == "에스프레소") { price =3500;
		case "에스프레소" :
			price = 3500;
			break;
		case "카푸치노" :
			price = 3500;
			break;
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노": 
			price = 2000;
			break;
		default:
			System.out.println(order + "는 주문할수 없는 메뉴입니다.");
			break;
		}
		
			System.out.print(order + "는 " + price + "입니다");;
		
		scanner.close();
		

	}
}
		
