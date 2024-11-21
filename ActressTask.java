package javatask;

import java.util.*;

public class ActressTask {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Select the Actress : Samantha | Asin | Trisha");
		String actress=sc.nextLine();
		
		switch(actress) {
		
		case "Samantha":
			
			System.out.println("Enter the pair for Samantha : Vijay | Surya | Dhanush");
			String Samanthapair = sc.nextLine();
			
			switch (Samanthapair) {
			case "Vijay" :
				System.out.println("Movie Name : Theri");
				break;
			case "Surya" :
				System.out.println("Movie Name : Anjaan");
				break;
			case "Dhanush" 	:
				System.out.println("Movie Name : ThangaMagan");
				break;
			default:
				System.out.println("[Unexpected Error: Choose the option mentioned above]");
				break;
			}
			break;
			
			
         case "Asin":
			
			System.out.println("Enter the pair for Asin : Vijay | Surya | Jayamravi");
			String Asinpair = sc.nextLine();
			
			switch (Asinpair) {
			case "Vijay" :
				System.out.println("Movie Name : Pokkiri");
				break;
			case "Surya" :
				System.out.println("Movie Name : Ghajini");
				break;
			case "Jayamravi" 	:
				System.out.println("Movie Name : M.kumaran s/o mahalakshmi");
				break;
			default:
				System.out.println("[Unexpected Error: Choose the option mentioned above]");
				break;
			}
			break;	
			
         case "Trisha":
 			
 			System.out.println("Enter the pair for Trisha : Vijay | Ajith | Vikram");
 			String Trishapair = sc.nextLine();
 			
 			switch (Trishapair) {
 			case "Vijay" :
 				System.out.println("Movie Name : Thirupaatchi");
 				break;
 			case "Ajith" :
 				System.out.println("Movie Name : Mankatha");
 				break;
 			case "Vikram" 	:
 				System.out.println("Movie Name : Bheema");
 				break;
 			default:
 				System.out.println("[Unexpected Error: Choose the option mentioned above]");
 				break;
 			}
		break;
	    default:
		        System.out.println("Actress Not Found; Select the Actress given above.");
		        break;
			
			
		}
			
		}
		
	}

