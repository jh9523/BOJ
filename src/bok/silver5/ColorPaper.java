package bok.silver5;
// https://www.acmicpc.net/problem/2563
import java.util.Scanner;

public class ColorPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] a = new int[100][100];
		int b = 0;
		int c =0;
		
		for(int i =0; i<n; i++) {
			b = sc.nextInt();
			c = sc.nextInt();
			
			for(int j = b; j<b+10; j++) {
				for(int k = c; k<c+10; k++) {
					if(j<100 && k <100) {
						a[j][k] = 1;
					}
				}
			}
			
		}
		
		
		int sum =0;
		for(int j = 0; j<100; j++) {
			for(int k = 0; k<100; k++) {
				sum +=a[j][k];
			}
		}
		
		System.out.println(sum);
		
		
	}

}