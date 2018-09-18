package Root;
import java.util.Scanner;

public class AIApp {

	public static void main(String[] args) {
		System.out.println("Hello!!");
	    Scanner input = new Scanner(System.in);
	    String answer = input.nextLine();
	    Scanner take  = new Scanner(System.in);
	    boolean hasName = false;
        String name = new String();
        boolean Conversation = true;
        
        
          while(Conversation == true) {
        	  
              if(hasName == true) {
                  System.out.println("Hello human! My name is " + name);
              } 
              else {
           	      System.out.println("Hello there! My name is..!!! I dont have a name yet! Would you like to give me a name? ");
              }
              
              
      	      if ((answer.equals("Yes") || answer.equals("yes")) || (answer.equals("sure") || answer.equals("yeah")) );{
  		          System.out.println("\nOOh GOOD! What want to call me then???");
  		          answer = name;
  		          hasName = true;
  	          }
      	      
      	      if (answer.equals("No") || answer.equals("no")){
      	    	  System.out.println("\nWhy not!!! Maybe because you don't have imagnation or not Good to pick a name!!??");
      	      }else if(answer.equals("I don't know") || ) {
      	    	  
      	      }

          }

        

        	
        	/*while (Conversation == true) {
        		
        		if (giveAName == 1) {
        			System.out.println( name + "!!!" + "that is a really Pretty name");
        		}
        	}*/
	}

}
