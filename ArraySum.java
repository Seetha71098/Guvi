import java.util.Scanner;
public class ArraySum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sum=0;
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
		}
		System.out.println(sum);
		scan.close();
	}
}
