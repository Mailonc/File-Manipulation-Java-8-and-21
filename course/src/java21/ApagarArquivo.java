package java21;

import java.nio.file.Files;
import java.nio.file.Path;

public class ApagarArquivo {

	public static void main(String[] args) {
		
		Path origem = Path.of("caminhojava21.txt");
		Path destino = Path.of("Backup/java.txt");
		
		try {
			Files.createDirectories(destino.getParent());
			Files.move(origem, destino);
			
		System.out.println("Arquivo Movido! ");
		}
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}

}
