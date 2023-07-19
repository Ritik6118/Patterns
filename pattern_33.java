package chitkara;

import java.util.Scanner;

public class pattern_33 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space=n-star;
		
		while(row<=n) {
			int val=n-row+1;
			int sp=1;
			while(sp<=space) {
				System.out.print("  ");
				sp++;
			}
			int st=1;
			while(st<=star) {
				System.out.print(val%n+" ");
				if(st<=star/2) {
					val++;
				}
				else {
					val--;
				}
				st++;
			}
			star+=2;
			space--;
			row++;
			System.out.println();
		}
	}
}
