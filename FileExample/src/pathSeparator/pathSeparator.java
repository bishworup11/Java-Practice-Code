package pathSeparator;

import java.io.File;

public class pathSeparator {
	public static void main(String[] args) {
		
		File demodir= new File("demodirectory");
		demodir.mkdir();
		String demodirPath= demodir.getAbsolutePath();
		
		String newFile=demodirPath+File.separator+"helloworld.txt" ;
		
		System.out.println(newFile);
		
		File newfile= new File(newFile);
		
		try {
			newfile.createNewFile();
			
			System.out.println("file is create");
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
		
	}

}
