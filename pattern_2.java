package chitkara;
import java.util.*;
public class pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		while(row<=n) {
			int st=1;
			while(st<=star) {
				System.out.print("* ");
				st++;
			}
			star++;
			System.out.println();
			row++;
		}
	}

}
