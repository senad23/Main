import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Maps {
	public static void main(String[] args){
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		
		testMap(hashMap);
		space();
		testMap(linkedMap);
		space();
		testMap(treeMap);

		
	}
	
	private static void space(){
		System.out.println();
	}
	
	private static void testMap(Map<Integer, String> map){
		map.put(5, "Braves");
		map.put(10, "Tigers");
		map.put(34, "Nationals");
		map.put(304, "Giants");
		
		for (Integer element : map.keySet()) {
			String value = map.get(element);
			System.out.println(element + ": " + value);
		}
	}

}
