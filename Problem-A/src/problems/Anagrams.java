package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Write a Java program to find Group anagrams ( Two words are anagram, if they  have same characters but in different order 
 * e.g. ABC, BAC, CAB, CBA, BCA are anagrams) E.g. Words �CAT, �DOG�, �TAC�, �MAD�, �DAM�, �AMD�, �GOD�, �SET�
 * 
 * Result should be in the form of : [CAT, TAC], [DOG, GOD], [MAD, DAM, AMD], [SET]
 * 
 * You can use any sample string to test the code
 */

public class Anagrams {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		// Input to for Grouping the Anagrams
		String[] input = { "CAT", "DOG", "TAC", "mad", "DAM", "AMD", "god", "SET" };

		//Making a copy of the input arrays of String
		List<String> originalCopy = Arrays.asList(input);

		/*
		 * Iterate the given input of String arrays using streams Convert the string
		 * element to char Arrays Sort each char element array by default natural
		 * sorting order. Collect them to a List of String
		 */
		List<String> inputDuplicate = Arrays.stream(input).map(a -> a.toCharArray()).map(b -> {
			Arrays.sort(b);
			return new String(b);
		}).collect(Collectors.toList());

		Map<String, List<Integer>> groupedAnagrams = new LinkedHashMap<>();
	
		/*
		 * Grouping the Anagrams and collecting their indices if repeated
		 */
		
		for (int i = 0; i < inputDuplicate.size(); i++) {
			if (!groupedAnagrams.containsKey(inputDuplicate.get(i))) {
				groupedAnagrams.put(inputDuplicate.get(i), new ArrayList<>());
				groupedAnagrams.get(inputDuplicate.get(i)).add(i);
			} else {
				groupedAnagrams.get(inputDuplicate.get(i)).add(i);
			}
		}

		Set<Entry<String,List<Integer>>> xy = groupedAnagrams.entrySet();
		List<List<String>> finalAnagrams = new LinkedList<List<String>>();

		/*
		 * Using the Anagrams indices collected into Map, 
		 * Retrieving the non sorted words from Original Copy.
		 */
		xy.forEach(z->{
			List<Integer> indices = z.getValue();
			List<String> groupedAnagrams2 = new LinkedList<String>();
			for(Integer index: indices) {
//				String x = originalCopy.get(index);
//				if(x.toLowerCase().equals(originalCopy.get(index))) {
					groupedAnagrams2.add(originalCopy.get(index));
//				}
			}
//			if(groupedAnagrams2.size() != 0) {
				finalAnagrams.add(groupedAnagrams2);

//			}
			
		});
		
		
//		finalAnagrams

//		
//		for(List<String> x: finalAnagrams) {
//			System.out.println(x+" Size: "+x.size());
//		}
		System.out.println(finalAnagrams.toString());
		long endTime = System.currentTimeMillis();
		System.out.println("Duration: "+(endTime-startTime));//Duration: 104, 108, 97, 103, 142, 107, 106, 130, 101

		
	}

}
