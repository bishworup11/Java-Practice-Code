package fileDemo2;

import java.util.Formatter;
import java.util.Scanner;

public class filedemo2 {
	public static void main(String[] args) {
		try {
			 Formatter formatter =new Formatter("F:/program files/Java/FileExample/person/student.txt");
			
			 Scanner input=new Scanner(System.in);
			 
			 System.out.println("input number of students\n");
			 
			 int num=input.nextInt();
			 
		
			 
			 String id,name;
			 for (int i = 0; i <num; i++) {
				 
				 System.out.println("input id\n");
				 id=input.next();
				 
				 System.out.println("input name\n");
				 name =input.next();
				 
				 
				 
				 formatter.format("%s %s\r\n",id,name);
				 
			
				
			}
			 formatter.close();
			 
			 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
