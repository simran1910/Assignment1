package lab6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

class Lab6Ex2{
       public static void main(String args[]) throws IOException{
            	int j=1;
                char ch;
                String filePath="D:\\Study\\Workspace\\fileRead\\readr.txt";
                InputStream f=new FileInputStream(filePath);
                System.out.println("\nContents of the file are");
                int n=f.available();
                System.out.print(j+": ");
                for(int i=0;i<n;i++){
                  ch=(char)f.read();
                  System.out.print(ch);
                  if(ch=='\n'){
                    System.out.print(++j+"-");
                  }                               
                }
       }
}

