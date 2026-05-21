package java8;

import java.io.File;

public class ApagarArquivo {

	public static void main(String[] args) {
		 
		File arquivo = new File("teste.txt");
		
		if (arquivo.delete()) {
			System.out.println("Arquivo apagado");
		}
		else {
			System.out.println("Falha ao apagar o arquivo");
		}
	}

}
