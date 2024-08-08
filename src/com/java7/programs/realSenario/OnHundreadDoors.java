package com.java7.programs.realSenario;

/*One Hundred Doors Problem: You have 100 doors in a row that are all initially closed. You make 100 passes by the doors. The first time through, 
you visit every door and toggle the door (if the door is closed, you open it; if it is open, you close it). 
The second time you only visit every 2nd door (door #2, #4, #6, ...). The third time, every 3rd door (door #3, #6, #9, ...), etc, 
until you only visit the 100th door.

Question: What state are the doors in after the last pass? Which are open, which are closed?*/

public class OnHundreadDoors {

	public static void main(String[] args) {
	      boolean[] doors = new boolean[101];
	 
	      for (int i = 1; i < doors.length; i++) {
	         for (int j = i; j < doors.length; j += i) {
	            doors[j] = !doors[j];
	         }
	      }
	 
	      for (int i = 1; i < doors.length; i++) {
	    	  if(doors.length >0) {
		         if (doors[i]) {
		            System.out.printf("Door %d is opened.\n", i);
		         }else {
		        	 System.out.printf("Door %d is closed.\n", i);
		         }
	    	  }else {
	    		  System.out.printf("There is no doors");
	    	  }    	
	      }
	   }
 
}
