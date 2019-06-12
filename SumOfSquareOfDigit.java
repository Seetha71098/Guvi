import java.util.Scanner;
public class SumOfSquareOfDigit {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=scan.nextInt();
		int temp=0,r;
		do{
			 r=n%10;
			 temp=temp+(int)Math.pow(r,2);
			 n=n/10;
		}
		while(n!=0);
			System.out.println(temp);
		scan.close();
		}
}
