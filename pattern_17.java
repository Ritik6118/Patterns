package chitkara;

import java.util.Scanner;

public class pattern_17 {
//	* * *   * * * 
//	* *       * * 
//	*           * 
//	              
//	*           * 
//	* *       * * 
//	* * *   * * * 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star1=n/2;
		int star2=n/2;
		int space= 1;
		while(row<=n) {
			int st1=1;
			while(st1<=star1) {
				System.out.print("* ");
				st1++;
			}
			int sp=1;
			while(sp<=space) {
				System.out.print("  ");	
				sp++;
			}
			int st2=1;
			while(st2<=star2) {
				System.out.print("* ");
				st2++;
			}
			if(row<=n/2) {
				star1--;
				star2--;
				space+=2;
			}
			else {
				star1++;
				star2++;
				space-=2;
			}
			row++;
			System.out.println();
		}
	}

}
