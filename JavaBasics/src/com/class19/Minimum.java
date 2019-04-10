package com.class19;

public class Minimum {
	
	    
	    
	    static int minOfValues(int[] x ){
	        
	        int min = x[0];
	        
	        for(int y: x) {
	            
	            if(y<min) {
	                min = y;
	            }
	        }
	        
	        
	        return min;
	        
	        
	        
	    }
}
