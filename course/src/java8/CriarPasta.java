package java8;

import java.io.File;

public class CriarPasta {

	public static void main(String[] args) {
		
		File pasta = new File("NovaPasta");
		
		if(pasta.mkdir()) {
			System.out.println("Pasta Criada!");
		}
		else {
			System.out.println("Error ao criar a pasta!");
		}

	}

}
