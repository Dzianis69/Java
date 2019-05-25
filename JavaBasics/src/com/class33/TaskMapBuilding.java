package com.class33;

import java.util.HashMap;
import java.util.Map;

public class TaskMapBuilding {
public static void main(String[] args) {
	
	Map<Integer,String> building = new HashMap<>();
	building.put(1, "Synrax");
	building.put(2, "Google");
	building.put(3, "Apple");
	building.put(4, "Peach");
	building.put(5, "Trump");
	building.put(6, "Peach");
	building.put(2, "FaceBook");
	building.put(7, "FaceBook");
	
	System.out.println(building.size());
	building.put(4, "Dell");
	building.remove(7);
	System.out.println(building.size());
	System.out.println(building);
	
}
}
