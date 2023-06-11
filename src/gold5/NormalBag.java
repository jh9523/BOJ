package gold5;
import java.util.Scanner;

// https://www.acmicpc.net/problem/12865

public class NormalBag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] a = new int[n+1][2];
		int[][] dp = new int[n+1][k+1];
		
		for(int i=0; i<n; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		
		for(int i =1; i<=n;i++) {
			for(int j = 1; j<=k;j++) {
				if(j-a[i][0]>=0) {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-a[i][0]]+a[i][1]);
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		System.out.println(dp[n][k]);
		
		

	}

}
