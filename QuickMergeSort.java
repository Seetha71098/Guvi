import java.util.Arrays;
import java.util.Scanner;
public class QuickMergeSort{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++){
			System.out.print(arr[i] +" ");
		}
		scan.close();
	}
}
