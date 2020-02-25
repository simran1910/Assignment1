package lab7;
import java.util.*;
public class Lab7Ex1{
	public static void main(String[] args){
		HashMap<Integer,String> map=new HashMap<>();
		System.out.println("Enter the number of elements: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			map.put(i,sc.next());
			}
		List<String> list=getValues(map);
		System.out.println(list);
		}
	public static List<String> getValues(HashMap<Integer,String> map){
		Collection<String> list1=map.values();
		List<String> list2 = new ArrayList<String>();
		for(String string:list1){
			list2.add(string);
			}
		Collections.sort(list2);
		return list2;
		}
	}

