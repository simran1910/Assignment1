package lab7;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab7Ex2{
static Map<Character,Integer> countCharacter(Character[] arr){
 HashMap<Character,Integer> map = new HashMap<>(); 
 List<Character> list =Arrays.asList(arr);
 int c=0;
 for(Character ch:list) {
  c=0;
  c=Collections.frequency(list, ch);
  map.put(ch, c);
 }

 return map;
}
public static void main(String[] args) {
  Character a[]= {'a','p','p','l','e'};
  System.out.println(countCharacter(a));
  }
}