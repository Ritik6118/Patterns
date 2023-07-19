package chitkara;

import java.util.Scanner;

public class pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=2*n-1;
		int row=1;
		int space=0;
		while(row<=n) {
			int sp=1;
			while(sp<=space) {
				System.out.print("  ");
				sp++;
			}
			int st=1;
			while(st<=star) {
				System.out.print("* ");
				st++;
			}
			star-=2;
			space++;
			row++;
			System.out.println();
		}
	}

}
