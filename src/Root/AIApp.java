package Root;
import java.util.Scanner;

public class AIApp {

	public static void main(String[] args) {
		System.out.println("Hello there! My name is..!!! I dont have a name yet! Would you like to give me a name? ");
	    Scanner input = new Scanner(System.in);
	    String answer = input.nextLine();
	    Scanner take  = new Scanner(System.in);
	    int giveAName = 0;
        String name = new String();
        
        
        	if (answer.equals("Yes") || answer.equals("yes"));{
        		System.out.println("OOh GOOD! What is my name???");
        		giveAName += 1;
        		
        		if (giveAName == 1) {
        			answer = name;
        		}
        	}
	}

}
