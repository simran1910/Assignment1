package Lab3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Lab3Ex4 {
		static HashMap<Character,Integer>charCount(Character ar[]) {
		HashMap<Character,Integer> hashMap=new HashMap<>();
		List <Character> list1=Arrays.asList(ar);
		int c=0;
		for(Character character:list1) {
			c=0;
			c=Collections.frequency(list1, character);
			hashMap.put(character, c);
		}
		return hashMap;
	}

	public static void main(String[] args) {
		Character[] ch={'a','p','p','l','e','a','n','d','m','a','n','g','o'};
		System.out.println(charCount(ch));
	}

}
