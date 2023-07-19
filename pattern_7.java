package chitkara;

import java.util.Scanner;

public class pattern_7 {

	
//	* * * * * * * * * * 
//	*                 * 
//	*                 * 
//	*                 * 
//	*                 * 
//	*                 * 
//	*                 * 
//	*                 * 
//	*                 * 
//	* * * * * * * * * * 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n;
		int row=1;
		while(row<=n) {
			if(row==1||row==n) {
				int st=1;
				while(st<=star) {
					System.out.print("* ");
					st++;
				}
			}
			else {
				System.out.print("* ");
				int sp=1;
				while(sp<=n-2) {
					System.out.print("  ");
					sp++;
				}
				System.out.print("* ");
			}
			row++;
			System.out.println();
		}
	}

}
