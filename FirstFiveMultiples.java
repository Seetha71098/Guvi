import java.util.Scanner;
public class FirstFiveMultiples {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int mul;
		for(int i=1;i<=5;i++){
			mul=i*n;
			System.out.println(mul);
		}
		
	}

}
