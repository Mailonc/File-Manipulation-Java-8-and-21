package application;

import java.nio.file.Files;
import java.nio.file.Path;

public class Program {

	public static void main(String[] args) {
		
		try {
			Path path = Path.of("/home/cesar/arquivo.txt");
			
			String txt = Files.readString(path);
			
			System.out.println(txt);
		}
		catch (Exception e) {
		System.out.println("Erro : " + e.getMessage());
		}
		

	}

}
