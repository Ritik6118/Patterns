package chitkara;

import java.util.Scanner;

public class pattern_29 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space=n-star;
		
		while(row<=n) {
			int val=row;
			int sp=1;
			while(sp<=space) {
				System.out.print("  ");
				sp++;
			}
			int st=1;
			while(st<=star) {
				if(st==1||st==star) {
					System.out.print(val+" ");					
				}
				else {
					System.out.println(0+" ");
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
