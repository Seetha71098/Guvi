import java.util.Scanner;
public class AreaTriangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int h=scan.nextInt();
		int b=scan.nextInt();
		int area=(b*h)/2;
		System.out.println(area);
		scan.close();
	}
}
