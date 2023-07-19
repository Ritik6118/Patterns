package chitkara;

import java.util.Scanner;

public class pattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n;
		int star=n;
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
				space--;
				star--;
			}
			else{
				space++;
				star++;
			}
			row++;
			System.out.println();
		}
	}

}
