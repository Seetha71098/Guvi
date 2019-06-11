import java.util.Scanner;
public class WeekendHoliday {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
String st=scan.nextLine();
if(st.contains("saturday")|| st.contains("sunday")){
System.out.println("yes");
}
else if(st.contains("monday")||st.contains("tuesday")||st.contains("wednesday")||st.contains("thursday")||st.contains("friday")){
System.out.println("no");
}
else{
	System.out.println("invalid");
}
scan.close();
}
}
