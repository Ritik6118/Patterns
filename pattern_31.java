package chitkara;

import java.util.Scanner;

public class pattern_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n;
		while(row<=n) {
			int val=n;
			int st=1;
			while(st<=star) {
				if(st+row==n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print(val+" ");
				}
				val--;
				st++;
			}
			row++;
			System.out.println();
		}
	}

}
