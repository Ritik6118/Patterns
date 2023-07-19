package chitkara;

import java.util.Scanner;

public class pattern_4 {

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
				System.out.print("* ");
				st++;
			}
			row++;
			System.out.println();
			star++;
			space--;
		}
		
	}

}
