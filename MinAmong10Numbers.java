import java.util.*;
public class MinAmong10Numbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=scan.nextInt();
        }
		int min=arr[0];
		for(int i=0;i<10;i++){
			if(arr[i]<min){
					min=arr[i];
				}
			}
		System.out.println(min);
		scan.close();
	}
}
