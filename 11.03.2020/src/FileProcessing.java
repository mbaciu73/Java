import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class FileProcessing {
	String      fileName;
	File        f1;
	Scanner     myScanner;
	PrintWriter myWriter;
	
	public FileProcessing(String fileName) {
		this.fileName = fileName;
	}
	
	void openFile() {
		f1 = new File(this.fileName);
	}
	//this reads the file entered into the class
	String readToken() {
		
		String token = "";
		try {
			Scanner myScanner = new Scanner(f1);
			token             = myScanner.next();
		} 
		catch (FileNotFoundException e) {
			System.out.println("Could not find the file");
			e.printStackTrace();
		}
		
		return token;
	}
	
	void write(String write) {
		try {
			myWriter = new PrintWriter(f1);
			myWriter.write(write);
		} catch (FileNotFoundException e) {
			System.out.println("The file has not been found");
			e.printStackTrace();
		}
		
	}
	
	void closeFile() {
		myScanner.close();
	}
}
