package chitkara;

import java.util.Scanner;

public class pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int row=1;
		while(row<=(2*n)-1) {
			int st=0;
			while(st<star) {
				System.out.print("* ");
				st++;
			}
			if(row<n) {
				star++;
			}
			else {
				star--;
			}
			row++;
			System.out.println();
		}
	}

}
