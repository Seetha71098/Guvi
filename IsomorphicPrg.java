import java.util.*;
public class IsomorphicPrg {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1=scan.next();
		String str2=scan.next();
		String temp="";
		String temp1="";
		int count=0;
		int count1=0;
		boolean flag=false;
		if(str1.length()!=str2.length()){
			System.out.println("No");
			}
			else{
			for(int i=0;i<str1.length();i++){
			if(!temp.contains(str1.substring(i,i+1))){
			temp+=str1.substring(i,i+1);
			}
			if(!temp1.contains(str2.substring(i,i+1))){
			temp1+=str2.substring(i,i+1);
			}
			}// <---removing duplicates
			for(int i=0;i<temp.length();i++){
			count=0;
			count1=0;
			for(int j=0;j<str1.length();j++){
			if(temp.charAt(i)==str1.charAt(j)){
			count++;
			}
			if(temp1.charAt(i)==str2.charAt(j)){
			count1++;
			}
			}
			if(count==count1){
			flag=true;
			continue;
			}
			else{
			System.out.println("No");
			break;
			}
			}
			if(flag){
			System.out.println("Yes");
			}
		}
		scan.close();
	}
}
