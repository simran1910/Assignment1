package lab8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgram {
	public static void main(String[] args) throws FileNotFoundException{
		FileInputStream in = new FileInputStream("sorce.txt");
		FileOutputStream out=new FileOutputStream("target.txt");
		new CopyDataThread(in, out).start();
		
	}

}
