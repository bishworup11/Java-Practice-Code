package fileDemo3;

import java.io.File;
import java.util.Scanner;

public class filedemo3 {
	public static void main(String[] args) {
		File file =new File("F:/program files/Java/FileExample/person/student.txt");
		
		try {
			
			Scanner scanner =new Scanner(file);
			
			while(scanner.hasNext())
			{
				
				String id =scanner.next();
				String name=scanner.next();
				System.out.println("ID :"+id+"\t Name :"+name);
				
			}
			
			scanner.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			
		  System.out.println(e);
		}
		
		
	}

}
