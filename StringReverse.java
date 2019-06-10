import java.util.Scanner;
public class StringReverse {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		String rev="";
		for(int i=st.length()-1;i>=0;i--){
		rev=rev+st.charAt(i);
		}
		System.out.println(rev);
		scan.close();

	}

}
