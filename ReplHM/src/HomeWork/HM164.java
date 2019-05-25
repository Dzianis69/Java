package HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HM164 {

	public static void main(String[] args){
		  Map<String, String> map = new HashMap<>();
		  map.put("ONE","AAA");
		  map.put("TWO","BBB");
		  map.put("THREE","CCC");
		  map.put("FOUR","DDD");
		  map.put("FIVE","EEE");
		  
		  ;
		  System.out.println("HashMap Before Remove :");
		  for(Map.Entry<String, String> key : map.entrySet() ){
		    System.out.println(key.getKey()+" : "+key.getValue());
		  }
		  map.remove("ONE", "AAA");
		  map.remove("FOUR", "DDD");
		  System.out.println("HashMap After Remove :");
		  for(Map.Entry<String, String> key : map.entrySet() ){
			    System.out.println(key.getKey()+" : "+key.getValue());
		}
		}
}