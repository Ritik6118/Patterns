package chitkara;

import java.util.Scanner;

public class pattern_25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space=n-star;
		int val=1;
		while(row<=n) {
			int sp=1;
			while(sp<=space) {
				System.out.print("\t");
				sp++;
			}
			int st=1;
			while(st<=star) {
				System.out.print(val+"\t");
				val++;
				st++;
			}
			star+=2;
			space--;
			row++;
			System.out.println();
		}
	}
}
