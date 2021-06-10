package collectionFramework.map;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("장코크", 26);
		map.put("권진영", 30);
		map.put("박영민", 29);
		map.put("김성호", 28);
		map.put("권진영", 56); 
		System.out.println("총 Entry 수  :"  + map.size());
		
		//객체 찾기
		System.out.println("\t장코크 : "+ map.get("장코크"));
		System.out.println();
		
		//객체 하나씩 처리
		Set<String> keySet = map.keySet(); //Key로 이루어진 Set객체 얻기
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);	
		}
		System.out.println();
		
		//객체 삭제
		map.remove("권진영");
		System.out.println("총 Entry 수  :"  + map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator(); 
			// 이렇게 하는 이유  -> Set 객체 여야만 반복자를 얻을 수 있으니까 -> hasNext(), next()같은 메소드 사용해서 추출하기 위해
		
		//반복자로 얻어낸 entry 에서 getKey() getValue() 메소드를 통해 추출할 수 있으니까 (바로 map객체에서 키나 값을 모를때 유용)
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey(); 
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);			
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());		
	}
}
