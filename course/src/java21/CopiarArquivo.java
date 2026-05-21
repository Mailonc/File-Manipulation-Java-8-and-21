package java21;

import java.nio.file.Files;
import java.nio.file.Path;

public class CopiarArquivo {

	public static void main(String[] args) {
		
		Path origem = Path.of("vivo.txt");
		Path destino =  Path.of("Copiajava21.txt");

		try {
			Files.copy(origem, destino);
			
			System.out.println("Arquivo Copiado");
			
		}
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
