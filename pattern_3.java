package chitkara;

import java.util.Scanner;

public class pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;	
		int star=n;
		while(row<=n) {
			int st=1;
			while(st<=star) {
				System.out.print("* ");
				st++;
			}
			star--;
			System.out.println();
			row++;
		}
	}

}
