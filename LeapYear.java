import java.util.Scanner;
public class LeapYear {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n%4==0){
			System.out.println("leap year");
		}
		else{
			System.out.println("non-leap year");
		}
	}

}
