package com.melodicabuild.cea;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Main { 
	  @SuppressWarnings("resource")
	public static void main(String[] args) {
		  Scanner myObj = new Scanner(System.in);
		  Scanner myObs = new Scanner(System.in);
		  while(true) {
			  
		  try {
			  System.out.println("Welcome to the Game Engine Creator Questionaire!");
			  System.out.println("Select an Option from the list below...");
			  System.out.println(" ");
			  System.out.println(Arrays.qs[0]);
			  System.out.println(Arrays.qs[1]);
			  System.out.println(Arrays.qs[2]);
			  System.out.println(Arrays.qs[3]);
			  System.out.println(Arrays.qs[4]);
			  try {
				int qX = Integer.valueOf(myObj.nextLine());
				if(qX > 5) {
					throw new EmptyStackException();
				}
			    int qI = qX - 1;
				System.out.println(Arrays.ans[qI]);
			  } catch(Exception e) {
				  throw new ArrayIndexOutOfBoundsException("Your Input is to big, Please use 1-5");
			  }
				  System.out.println(" ");
				  System.out.println("Would you like to choose another? Y/N");
				    char continueInput = myObs.next().charAt(0);
				    String sI = Character.toString(continueInput);
				    String basic = sI.toUpperCase();
				    char sIn = basic.charAt(0);
				    if (sIn == 'Y') {
				        continue;
				    } else if(sIn == 'N'){
				       System.out.println("Goodbye!");
				       break;
				    } else {
				    	throw new NoSuchFieldException("Your Field is not Listed, Please use Y/N");
				    }
		  } catch(Exception e) {
			  throw new RuntimeException(e);
		  }
		  
//		  System.out.println(Arrays.jdesc);
//		  System.out.println(Arrays.locale);
//		  System.out.println(Arrays.interest);
//		  System.out.println(Arrays.salary);
//		  System.out.println(Arrays.wrole);
	  }
	  }
}