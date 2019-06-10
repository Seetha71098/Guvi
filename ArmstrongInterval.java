import java.util.Scanner;
public class ArmstrongInterval {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    int m=scan.nextInt();
	    int temp;
	    int r=0;
	    int c=0;
	    for(int i=n;i<m;i++){
	       temp=i;
	       c=0;
	    while(temp!=0){
	    r=temp%10;
	    temp=temp/10;  
	    c=c+(r*r*r);  
	    }
	    if(i==c){
	    System.out.println( c +" ");
	    }
	   
	     }
	    }
	 }
