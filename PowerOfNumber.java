import java.util.Scanner;
public class PowerOfNumber {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int value=(int)Math.pow(n, m);
		System.out.println(value);
	}

}
