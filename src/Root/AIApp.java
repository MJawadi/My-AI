package Root;
import java.util.Scanner;

public class AIApp {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    String answer = input.nextLine();
	    boolean hasName = false;
        String name = new String();
        boolean Conversation = true;
        
          System.out.println("Hello!!");
          while(Conversation) {
        	  
              if(hasName == true) {
                  System.out.println("Hello human! My name is " + name);
              } 
              else {
           	      System.out.println("Hello there! My name is..!!! I dont have a name yet! Would you like to give me a name? ");
                  answer = input.nextLine();
          	      if ((answer.equals("Yes") || answer.equals("yes")) || (answer.equals("sure") || answer.equals("yeah")) );{
      		          System.out.println("\nOOh GOOD! What you want to call me then???");
      		          name = input.nextLine();
      		          hasName = true;
      		          System.out.println(name + "!!!" + "It's pretty!! I like it :)");
      	          }
          	      if (answer.equals("No") || answer.equals("no")){
          	    	  System.out.println("\nWhy not!!! Maybe because you don't have imagnation or not Good to pick a name!!??");
          	      }else if(answer.equals("I don't know") || answer.equals("i dont know")) {
          	    	  
          	      }
              }

      	      


          }

        

        	
        	/*while (Conversation == true) {
        		
        		if (giveAName == 1) {
        			System.out.println( name + "!!!" + "that is a really Pretty name");
        		}
        	}*/
	}

}
