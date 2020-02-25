package lab7;
import java.util.Arrays;
public class Lab7Ex5{
	static int getSecondSmallest(int[] arr){
		Arrays.sort(arr);
        return arr[1];
        }
	public static void main(String[] args){
		int arr[]= {33,5,400,60};
        int ss=getSecondSmallest(arr);
        System.out.println(ss);
        }
	}
