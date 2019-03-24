package kr.ac.kookmin.cs.oop.ch4;

public class Random {

	public static void main(String[] args) {
		
		int input = 10;
		int[][] random = new int[input][input];
		
		for( int i = 0; i<input; i++) {
			for(int j =0; j<input; j++) {
				int k = (int)(Math.random()*100+1);
				random[i][j] = k; 
			}
		}
		for( int i = 0; i<input; i++) {
			for(int j =0; j<input; j++) {
				System.out.print(random[i][j]+" " );
				
			}
			System.out.println();
		}
	}

}
