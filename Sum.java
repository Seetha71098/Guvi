import java.util.Scanner;
public class Sum {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int sum=0;
		int n=scan.nextInt();
		for(int i=1;i<=n;i++){
			sum=sum+i;
			//System.out.println(sum);
		}
		System.out.println(sum);
		
	}

}
