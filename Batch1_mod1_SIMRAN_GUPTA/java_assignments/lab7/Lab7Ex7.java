package lab7;
import java.util.Arrays;

public class Lab7Ex7{
	static int[] getSorted(int[] arr){
		int ss[]=new int[arr.length];
        String p[]=new String[arr.length];
        String s=Arrays.toString(arr);
        System.out.println(s);
        int j=0;
        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<arr.length;i++){
        	sb=sb.reverse();	  
        	Integer.parseInt(sb.toString());
        	}
        Arrays.sort(ss);
        return ss;
        }
	public static void main(String[] args){
		int x[]={12,45,87};
        System.out.println(getSorted(x));
        }
	}

