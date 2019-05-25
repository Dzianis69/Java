package HomeWork;

import java.util.ArrayList;

public class HM150 {
	
	public static void main(String [] args){
	    ArrayList<Boolean> boo = new ArrayList<>();
	    boo.add(true);
	    boo.add(false);
	    boo.add(false);
	    
	     for(int i = 0; i < 3; i++){
	       boo.add(boo.get(i));
	     }
	     for(Boolean bo : boo) {
	    	 System.out.print(bo+",");
	     }
	  }

	}

