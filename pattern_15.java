package chitkara;

import java.util.Scanner;

public class pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n;
		int space=0;
		int row=1;
		while(row<=2*n-1) {
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
			if(row<n) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			row++;
			System.out.println();
		}
	}

}
