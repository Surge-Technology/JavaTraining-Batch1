import java.util.Scanner;

public class StringManipulation {
public static void main(String[] args)
{
	Scanner sc =  new Scanner(System.in);
	char DoubleQuotes ='"';
	String paragraph = sc.nextLine();

	 paragraph= paragraph.replace("29.2%", DoubleQuotes+"29.2%"+DoubleQuotes);
	 paragraph= paragraph.replace("70.8%", DoubleQuotes+"70.8%"+DoubleQuotes);
	System.out.println(paragraph.replaceAll("the","The"));
	
}	
}
