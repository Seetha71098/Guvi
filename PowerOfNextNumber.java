import java.util.*;
public class PowerOfNextNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		String str=String.valueOf(num);
		int n=0;
		for(int i=0;i<str.length()-1;i++){
			n+=(int)Math.pow(Integer.parseInt(str.substring(i,i+1)),Integer.parseInt(str.substring(i+1,i+2)));
		}
		n+=Integer.parseInt(str.substring(str.length()-1));
		System.out.println(n);
	}
}
