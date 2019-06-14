import java.util.Scanner;
public class CamelCase {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		for(String i : str.split(" ")){
		String r = i.substring(0, 1);
		System.out.print(r.toUpperCase() + i.substring(1).toLowerCase()+" ");
		 }
	}
}
