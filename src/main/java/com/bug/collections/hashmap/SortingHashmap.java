package com.bug.collections.hashmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortingHashmap {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "Patna");
		map.put(3, "Bangalore");
		map.put(4, "chennai");
		map.put(1, "Pune");
		map.put(5, "Jaipur");
		map.put(7, "Goa");
		map.put(8, "Gujarat");
		map.put(9, "Chandigarh");
		map.put(10, "Chattisgarh");
		map.put(98, "Kabul");
		map.put(28, "Afganisthan");
		map.put(29, "america");

		System.out.println("******************USING COMPARATOR************");
		Map<Integer, String> sortedMapOfComparator = sortByValueUsingComparator(map);
		sortedMapOfComparator.entrySet().stream().forEach(System.out::println);
		
		System.out.println("******************USING LAMBDA************");
		Map<Integer, String> sortedMapOfLambda = sortByValueUsingLambda(map);
		sortedMapOfLambda.entrySet().stream().forEach(System.out::println);
		
		System.out.println("******************USING STREAM************");
		Map<Integer, String> sortedMapOfStream = sortByValueUsingStream(map);
		sortedMapOfStream.entrySet().stream().forEach(System.out::println);
		
		System.out.println("******************USING GENERICS************");
		Map<Integer, String> sortedMapOfGenerics = SortByValuesUsingGenerics(map);
		sortedMapOfGenerics.entrySet().stream().forEach(System.out::println);
	}

	private static Map<Integer, String> sortByValueUsingComparator(Map<Integer, String> map) {
		
		List<Map.Entry<Integer, String>> list = new LinkedList<>(map.entrySet());
		
		//Using Comparator
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		Map<Integer, String> sortedMap = new HashMap<>();
		for(Map.Entry<Integer, String> hm : list) {
			sortedMap.put(hm.getKey(), hm.getValue());
		}
		return sortedMap;
	}

	private static Map<Integer, String> sortByValueUsingLambda(Map<Integer, String> map) {
		
		List<Map.Entry<Integer, String>> list = new LinkedList<>(map.entrySet());
		
		//Using Lambda
		Collections.sort(list, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));
		
		Map<Integer, String> sortedMap = new HashMap<>();
		for(Map.Entry<Integer, String> hm : list) {
			sortedMap.put(hm.getKey(), hm.getValue());
		}
		return sortedMap;
	}
	
	private static Map<Integer, String> sortByValueUsingStream(Map<Integer, String> map) {
		
		//Using Stream
		Map<Integer, String> sortedMap = map.entrySet().stream()
				.sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
						(e1, e2) -> e1, LinkedHashMap::new));
				
				
		return sortedMap;
	}
	
	private static <K,V extends Comparable<? super V>> Map<K,V> SortByValuesUsingGenerics(Map<K,V> map) {
	    SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
	        new Comparator<Map.Entry<K,V>>() {
	            @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
	                int res = e1.getValue().compareTo(e2.getValue());
	                return res != 0 ? res : 1;
	            }
	        }
	    );
	    
	    sortedEntries.addAll(map.entrySet());
	    Map<K,V> sortedMap = new HashMap<>();
	    for (Map.Entry<K, V> entry : sortedEntries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
	    
	    return sortedMap;
	}
}



/**
 ******************USING COMPARATOR************
1=Pune
98=Kabul
2=Patna
3=Bangalore
4=chennai
5=Jaipur
7=Goa
8=Gujarat
9=Chandigarh
10=Chattisgarh
28=Afganisthan
29=america
******************USING LAMBDA************
1=Pune
98=Kabul
2=Patna
3=Bangalore
4=chennai
5=Jaipur
7=Goa
8=Gujarat
9=Chandigarh
10=Chattisgarh
28=Afganisthan
29=america
******************USING STREAM************
28=Afganisthan
3=Bangalore
9=Chandigarh
10=Chattisgarh
7=Goa
8=Gujarat
5=Jaipur
98=Kabul
2=Patna
1=Pune
29=america
4=chennai
******************USING GENERICS************
1=Pune
98=Kabul
2=Patna
3=Bangalore
4=chennai
5=Jaipur
7=Goa
8=Gujarat
9=Chandigarh
10=Chattisgarh
28=Afganisthan
29=america
**/
