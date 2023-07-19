package chitkara;

import java.util.Scanner;

public class pattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=n-star;
		int row=1;
		while(row<=n) {
			int sp=1;
			while(sp<=space) {
				System.out.print("  ");
				sp++;
			}
			int st=1;
			while(st<=star) {
				if(st%2==0) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");					
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
