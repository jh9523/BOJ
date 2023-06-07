package bok.silver5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		
		for(int i =0; i< n; i++) {
			a.add(sc.nextInt());
		}
		
		Collections.sort(a);
		
		for(Integer c : a) {
			sb.append(c).append("\n");
		}
		System.out.println(sb);
		
	}

}
