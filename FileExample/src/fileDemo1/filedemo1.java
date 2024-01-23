package fileDemo1;

import java.io.File;

public class filedemo1 {
	public static void main(String[] args) {
		File dir=new File("person");
		dir.mkdir();
		String s=dir.getAbsolutePath();
		System.out.println(dir.getName());
		System.out.println(s);
		
		File file1= new File(s+"/student.txt");
		File file2=new File(s+"/teacher.txt");
		
		try {
			file1.createNewFile();
			file2.createNewFile();
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
		
		if(file1.exists())
		{
			System.out.println("file exist");
		}
		
		else
		{
			System.out.println("file does not exist");
		}
		
		
	}

}
