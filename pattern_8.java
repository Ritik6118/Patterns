package chitkara;

import java.util.Scanner;

public class pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		while(row<=n) {
			int col=1;
			while(col<=n) {
				if(row==col || row+col==n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				col++;
			}
			row++;
			System.out.println();
		}
	}

}
