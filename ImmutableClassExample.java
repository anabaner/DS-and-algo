package Practice;

import java.util.HashMap;
import java.util.Map;

final class ImmutableClassExample {

	private final int id;
	private final String name ;
	private final Map<String,String> metadata;
	
	public ImmutableClassExample(int id,String name ,Map<String,String> metadata){
		this.id= id;
		this.name = name ;
		Map<String,String> tempMap = new HashMap<String,String>();
		for(Map.Entry<String, String> entry: metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		this.metadata = tempMap;
	
	}
	
	public String getName() {return name;}
	public int getId() {return id;}
	
	public Map<String,String> getMetadata(){
		Map<String,String> tempMap = new HashMap<String,String>();
		for(Map.Entry<String, String> entry: metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}
	
	
	public static void main(String[] args) {

		 Map<String, String> map = new HashMap<>();
		 
	        map.put("1", "first");
	        map.put("2", "second");
	 
	        ImmutableClassExample s = new ImmutableClassExample( 101,"ABC", map);
	 
	        System.out.println(s.getName());
	        System.out.println(s.getId());
	        System.out.println(s.getMetadata());
	 
	 
	        map.put("3", "third");

	        System.out.println(s.getMetadata());
	        s.getMetadata().put("4", "fourth");

	        
	        System.out.println(s.getMetadata());
		
	}

}


/*
ABC
101
{1=first, 2=second}
{1=first, 2=second}
{1=first, 2=second}
*/
