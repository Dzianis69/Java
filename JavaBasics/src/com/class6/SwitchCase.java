package com.class6;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int day=4;
		String nameDay;
			switch(day) {
			case 1:
				nameDay="Monday";
				break;
			case 2:
				nameDay="Tuesday";
				break;
			case 3:
				nameDay="Wensday";
				break;
			case 4:
				nameDay="Thursday";
				break;
			case 5:
				nameDay="Friday";
				case 6:
					nameDay="Saturday";
				break;
				case 7:
					nameDay="sunday";
					break;
					default:
						nameDay="invalid day";
			
			}
			System.out.println("Today is "+nameDay);
	}

}
