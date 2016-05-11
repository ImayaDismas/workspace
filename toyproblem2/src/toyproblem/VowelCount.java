// VOWEL COUNT
// LANGUAGE: JAVA

// Create a VowelCount class with a vowelCount method and a main method.
// The vowelCount method should contain the algorithm and the main method
// should be used for testing your algorithm.To make testing easier, make the vowelCount method static.

// Given an input of a String sentence, count the number of vowels that occur in the sentence.
// Return a HashMap object containing the vowels as keys and their counts as values.

// Example:
// HashMap vowelMap = VowelCount.vowelCount("mary had a little lamb");
// vowelMap.get('a'); // 4
// vowelMap.get('i'); // 1
// vowelMap.get('e'); // 1
// vowelMap.get('o'); // null
// HashMap vowelMap = VowelCount.vowelCount("do we control our computers, or do they control us?");
// vowelMap.get('o'); // 8
// vowelMap.get('i'); // 
package toyproblem;

import java.util.*;;

public class VowelCount {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static HashMap vowelCount(String string){
		//Algorithm
		HashMap<String, Integer> hm = new HashMap();
		String input = string;
		int charCounta = 0;
		int charCounte = 0;
		int charCounti = 0;
		int charCounto = 0;
		int charCountu = 0;
        for(int i =0 ; i<input.length(); i++){
            if(input.charAt(i) == 'a' ||input.charAt(i) == 'A'){
                charCounta++;
            }
            if(input.charAt(i) == 'e' ||input.charAt(i) == 'E'){
                charCounte++;
            }
            if(input.charAt(i) == 'i' ||input.charAt(i) == 'I'){
                charCounti++;
            }
            if(input.charAt(i) == 'o' ||input.charAt(i) == 'O'){
                charCounto++;
            }
            if(input.charAt(i) == 'u' ||input.charAt(i) == 'U'){
                charCountu++;
            }
        }
     // Put elements to the map
        hm.put("a", charCounta);
        hm.put("e", charCounte);
        hm.put("i", charCounti);
        hm.put("o", charCounto);
        hm.put("u", charCountu);
        
     // Get a set of the entries
        //Set set = hm.entrySet();
        // Get an iterator
//        Iterator i = set.iterator();
        
//        while(i.hasNext()) {
//            Map.Entry me = (Map.Entry)i.next();
//            System.out.print(me.getKey() + ": ");
//            System.out.println(me.getValue());
//         }
//        System.out.println("");
//        System.out.println("Print command inside the vowelCount method");
//        //outside the loop
//        System.out.println("a = " + hm.get("a"));
//        System.out.println("e = " + hm.get("e"));
//        System.out.println("i = " + hm.get("i"));
//        System.out.println("o = " + hm.get("o"));
//        System.out.println("u = " + hm.get("u"));
		return hm;
	}
	@SuppressWarnings("rawtypes")
	public static void main(String[] args){
		//Used for testing
//		@SuppressWarnings("resource")
//		Scanner inputs = new Scanner(System.in);
//		System.out.println("Enter your string: ");
//		String sentence = inputs.next();
//		@SuppressWarnings("rawtypes")
		HashMap vowelMap = VowelCount.vowelCount("mary had a little lamb");
		System.out.println("");
		System.out.println("Print command inside main method");
		System.out.println("a = " + vowelMap.get("a"));
		System.out.println("e = " + vowelMap.get("e"));
		System.out.println("i = " + vowelMap.get("i"));
		System.out.println("o = " + vowelMap.get("o"));
		System.out.println("u = " + vowelMap.get("u"));
		System.out.println("");
		HashMap vowelMap1 = VowelCount.vowelCount("do we control our computers, or do they control us?");
		System.out.println("");
		System.out.println("Print command inside main method");
		System.out.println("a = " + vowelMap1.get("a"));
		System.out.println("e = " + vowelMap1.get("e"));
		System.out.println("i = " + vowelMap1.get("i"));
		System.out.println("o = " + vowelMap1.get("o"));
		System.out.println("u = " + vowelMap1.get("u"));
	}

}
