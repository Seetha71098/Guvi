import java.util.Scanner;
public class NumberReverses {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=scan.nextInt();
		int rev=0;
		while(num!=0){
			int sum=num%10;
			rev=rev*10+sum;
			num=num/10;
		}
		System.out.println("Reversed number:" +rev);
		scan.close();
	}
}
