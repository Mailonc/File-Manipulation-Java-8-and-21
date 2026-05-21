package java21;

import java.nio.file.Files;
import java.nio.file.Path;

public class CriarArquivoJava21 {

	public static void main(String[] args) {
	  
		
		Path caminho = Path.of("caminhojava21.txt");
		
		try {
			Files.createFile(caminho);
			
			System.out.println("Arquivo Criado!");
		}
		catch (Exception e) {
		    System.out.println("Error " + e.getMessage());
		}
	}

}
