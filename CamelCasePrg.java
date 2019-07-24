import java.util.Scanner;
public class CamelCasePrg {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int count=0;
		String str1[]=str.split(" ");
		for(int i=0;i<str1.length;i++){
			if(Character.isUpperCase(str1[i].charAt(0))){
				count++;
				}
			}
		if(count==str1.length){
			System.out.println("yes");
		}
		scan.close();
	}
}
