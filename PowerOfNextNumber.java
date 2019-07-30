import java.util.*;
public class powerOfNextNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		String str=String.valueOf(num);
		int n=0;
		if(str.length()>1){
		for(int i=0;i<str.length()-1;i++){
			n+=(int)Math.pow(Integer.parseInt(str.substring(i,i+1)),Integer.parseInt(str.substring(i+1,i+2)));
		}
		n+=(int)Math.pow(Integer.parseInt(str.substring(str.length()-1)),Integer.parseInt(str.substring(0,1)));
		}
		else{
		n+=(int)Math.pow(Integer.parseInt(str.substring(str.length()-1)),2);
		}
		System.out.println(n);
		scan.close();
	}
}
