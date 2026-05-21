package java21;

import java.nio.file.Files;
import java.nio.file.Path;

public class EscreverArquivoModerno {

	public static void main(String[] args) {
		try {
			Files.writeString(Path.of("/home/cesar/arquivo.txt"),

					"Working with Files in Modern Java Starting from Version 21"
					+ "\nLearning in Java 8: Why We Need to Understand Older Languages");
					

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
