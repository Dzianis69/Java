package com.class7;

public class Task1 {
	/*public static void main(String[] args) {
		boolean workDay=true;
		int day=1;
		while(day<7) {
			System.out.println("I need a day off");
			if(day>5) {
				System.out.println("I do not a day off");
				workDay=false;
				
			}
			day++;
		}
	}
	
	
}*/

	public static void main(String[] args) {             
		// TODO Auto-generated method stub
boolean workDay=true;
int day=1;
while(workDay) {
	System.out.println(" I need a day off");
	day++;
	if(day==6) {
		System.out.println("I dont need");

		break;
		
	}
	
}

	}

}
/*	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        boolean workday;
	        int num=1;
	        while (num<=7) {
	            //System.out.println("we are insede while");
	            if(num<=5) {
	                System.out.println("i need dayoff");

	            }else {workday=false;
	                
	            }
	            num++;
	        }

	    }

	}*/