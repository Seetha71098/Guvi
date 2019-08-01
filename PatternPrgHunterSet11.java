import java.util.*;
public class PatternPrgHunterSet11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
				int t=1;
		for (int i=1;i<=n;i++){
			 for (int j=1;j<=t;j++){
                System.out.print("1"+" ");
               }
			 t+=2;
			 System.out.println();
		 }
        scan.close();
	}
}
