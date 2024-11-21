package javatask;

import java.util.*;
public class ActorsTask {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Actor Name Vijay | Rajini | Kamal ");
		String actor=sc.nextLine();
		
		switch (actor) {
        case "vijay":
            System.out.println("Select the movie for review : Thuppaki | Puli | Theri | Kaththi | Sura)");
            String VijayMovies = sc.nextLine();

            switch (VijayMovies) {
                case "Thuppaki":
                    System.out.println("Block buster");
                    break;
                case "Puli":
                    System.out.println("Flop");
                    break;
                case "Theri":
                    System.out.println("Block buster");
                    break;
                case "Kaththi":
                	System.out.println("Block buster");
                	break;
                case "Sura":
                	System.out.println("Flop");
                	break;
                default:
                    System.out.println("[Enter the Movie name Mentioned above]");
                    break;
            }
            break;
           	
       	case "rajini" :
        	System.out.println("Select the movie for review : Enthiran | Sivaji | Baba | Annathe");
        	String RajiniMovies = sc.nextLine();
    	   
        	switch (RajiniMovies) {
        		case "enthiran":
        			System.out.println("Block buster");
        			break;
        		case "sivaji":
        			System.out.println("Block buster");
        			break;
        		case "baba":
        			System.out.println("Flop");
        			break;
        		case "annathe":
        			System.out.println("Flop");
        			break;
        		default:
        			System.out.println("[Enter the Movie name Mentioned above]");
        			break;
        	}
        	
             case "kamal":
         	
         	System.out.println("Select the movie for review : Vikram | Nayakan | Vishwaroopam 2 | Indian 2");
         	String KamalMovies = sc.nextLine();
         	
         	switch (KamalMovies) {
         		case "vikram" :
         			System.out.println("Block buster");
         			break;
         		case "nayakan":	
         			System.out.println("Block buster");
         			break;
         		case "vishwaroopam 2":
         			System.out.println("Flop");
         			break;
         		case "indian 2":
         			System.out.println("Flop");
         			break;
         		default:
                     System.out.println("[Enter the Movie name Mentioned above]");
                     break;
         		}
        		
             	break;
         	  default:
         		      System.out.println("Invalid actor, plz Select the actor above");
         		      break;
		
        		
		}
		
	}

}
