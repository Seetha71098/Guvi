import java.util.Scanner;
public class RightAngTriPatPrg {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=scan.nextInt();
		for(int i=num;i>=1;i--){
			for(int j=1;j<=i;++j){
				System.out.print("1 ");
			}
			System.out.println();
		}
		scan.close();
	}
}
