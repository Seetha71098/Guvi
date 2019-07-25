import java.util.Scanner;
public class NumericString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
        boolean numeric = true;
        try {
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        if(numeric)
            System.out.println("yes");
        else
            System.out.println("no");
        scan.close();
    }
	}
