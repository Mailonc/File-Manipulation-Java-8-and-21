package java21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListarArquvosPasta {

	public static void main(String[] args) {

		Path documento = Path.of(".");

		try {

			Files.list(documento).forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
