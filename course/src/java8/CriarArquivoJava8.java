package java8;

import java.io.File;

public class CriarArquivoJava8 {

	public static void main(String[] args) {
		
        File arquivo = new File ("teste.txt");
        
        try {
        	
        	if(arquivo.createNewFile()) {
        		System.out.println("Arquivo Criado!");
        	}
        	else {
        		System.out.println("O Arquivo já existe");
        	}
        }
        catch (Exception e) {
        	System.out.println("error ao criar o arquivo. ");
        	e.printStackTrace();
		}
	}

}
