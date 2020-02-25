package lab7;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class Lab7Ex6{
	static List votersList(Map<Integer,LocalDate> map){
		LocalDate local=null;
        LocalDate date=LocalDate.now();
        List<Integer> list=new ArrayList<>();
        Set<Integer> keyset=map.keySet();
        for(Integer key:keyset){
        	local=map.get(key);
            int year=Period.between(local, date).getYears();
            if(year>=18) {
            	list.add(key);
            	}
            }
        return list;
        }
	public static void main(String[] args){
		HashMap<Integer,LocalDate> map = new HashMap<>();
		map.put(1001, LocalDate.of(2001, 2, 05));
		map.put(1081, LocalDate.of(2011, 1, 9));
		map.put(1071, LocalDate.of(2019, 7, 8));
		System.out.println(votersList(map));
		}
}