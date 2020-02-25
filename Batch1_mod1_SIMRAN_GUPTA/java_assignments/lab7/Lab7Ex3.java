package lab7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Lab7Ex3{
 static Map<Integer,Integer> getSquares(Integer arr[]){
 HashMap<Integer,Integer> map=new HashMap<>();
 List<Integer> list=Arrays.asList(arr);
 for(Integer i:list) { 
	int value=i*i;
    map.put(i, value);
    }
 return map;
 }

public static void main(String[] args){
	Integer arr[]= {1,2,3,4};
    System.out.println(getSquares(arr));
    }
}