import java.util.Arrays;
import java.util.Scanner;
public class RepeatedNumber{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		int count=0;
		for(int i=0;i<n;i++){
			count=0;
			for(int j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count>=1){
				System.out.println(arr[i]);
			}
		}
		scan.close();
     }
}
