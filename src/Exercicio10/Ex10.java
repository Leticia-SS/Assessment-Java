package Exercicio10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        short counter = 1;

        String path = "src/Exercicio10/compras.txt";

        while (counter < 4) {
            System.out.println("Cadastro de compra " + counter);
            System.out.print("Produto: ");
            String produto = input.nextLine();
            System.out.print("Quantidade: ");
            int quantidade = input.nextInt();
            System.out.print("Preço: ");
            double preco = input.nextDouble();

            input.nextLine();
            Compras compra = new Compras(produto, quantidade, preco);
            EscreverCompras(compra, path);
            counter++;
        }
        System.out.println("\n======Compras Cadastradas======");
        LerCompras(path);
    }
    public static void LerCompras(String path){
        try {
            InputStream inputStream = new FileInputStream(path);
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader buffReader = new BufferedReader(reader);
            String line = null;

            while ((line = buffReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception er) {
            System.out.println("Erro na leitura do arquivo");
            System.out.println(er.getMessage());
        }
    }

    public static void EscreverCompras(Compras compra, String path){
        try {
            Path pasta = Paths.get(path);
            OutputStream stream = new BufferedOutputStream(Files.newOutputStream(pasta, StandardOpenOption.APPEND));
            String line = compra.exibirCompras();
            stream.write(line.getBytes());
            stream.close();
        } catch (Exception er) {
            System.out.println("Erro na escrita do arquivo");
            System.out.println(er.getMessage());
        }
    }
}
