import java.util.Scanner;
public class IndexPos {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++){
			num[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.println(" "+num[i]+" "+i);
		}
		scan.close();
	}
}
