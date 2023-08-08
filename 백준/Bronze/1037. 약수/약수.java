import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner scann = new Scanner(System.in);
		
		int T = scann.nextInt();
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while(T-- > 0) {
			int N = scann.nextInt();
			
			if(N > max) max = N;
			if(N < min) min = N;
		}
		System.out.println(max * min);
	}
 
}