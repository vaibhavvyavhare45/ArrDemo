package com.warrior.array;

import java.util.Scanner;

public class OneDimentional {
public static void main(String[] args) {
			
		

		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<5;i++) {
			System.out.println("\n\n\t Enter any value: ");
			a[i]=sc.nextInt();
			
		}
		System.out.println("\n\n\t arrays value are: ");
		for(int i=0;i<5;i++) {
		System.out.println("value is: "+a[i]);	
			
		}
}
}