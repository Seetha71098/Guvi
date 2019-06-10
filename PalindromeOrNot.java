import java.util.Scanner;
public class PalindromeOrNot {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int  temp, sum=0;
		temp=n;  
        while(n>0)  
        {  
            int r = n%10;  
            sum = sum*10+r;  
            n = n/10;  
        }
        if(temp==sum)  
        {  
            System.out.println("Palindrom");  
        }  
        else  
        {  
            System.out.println("Not Palindrom");  
        }  
		
	}

}
