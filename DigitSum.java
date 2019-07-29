import java.util.*;
public class DigitSum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<=i;j++){
				sum+=a[j];
			}
		}
		System.out.println(sum);
		scan.close();
	}
}
