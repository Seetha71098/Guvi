import java.util.*;
public class EvenOdd {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n%2==0){
			System.out.println("even number");
		}
		else if(n%2==1){
			System.out.println("odd number");
		}
		else{
			System.out.println("invalid");
		}
	}

}
