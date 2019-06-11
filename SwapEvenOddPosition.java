import java.util.Scanner;
public class SwapEvenOddPosition {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=scan.next();
		char ch[]=str.toCharArray();
		char temp;
		for(int i=0;i<ch.length;i++){
			if(i%2==0){
				temp=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=temp;
			}
		}
		for(char s:ch){
			System.out.print(s);
		}
		scan.close();
	}
	

}
