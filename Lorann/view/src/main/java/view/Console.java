package view;

import java.util.Scanner;

public class Console {
	
	public String whatMap() { // placeholder menu to choose a map
		String choice;
		System.out.println("what level do you want to play? (1 to 5 or r for random)");
		Scanner sc = new Scanner(System.in);
		
		 choice = sc.nextLine() ;
		
		 if(choice.contains("5")) {
			 return "5";
		 }
		 else if(choice.contains("4")) {
			 return "4";
		 }
		 else if(choice.contains("3")) {
			 return "3";
		 }
		 else if(choice.contains("2")) {
			 return "2";
		 }
		 else if(choice.contains("1")) {
			 return "1";
		 }
		 else {
			 System.out.println("random it is then");
			 double r = Math.random()%5;
			 
			 
			 switch ((int)r){
			 case 0: 
				 return "5";
				 
			 case 1:
				 return "4";
				
			 case 2: 
				 return "3";
				 
			 case 3:
				 return "2";
				 
			 case 4: 
				 return "1";
				 
				 default:
					 return "1";
				 
			 
			 }
			 
		 }
		
	}
	public Console() {
		System.out.println("sa reum");
	}

}
