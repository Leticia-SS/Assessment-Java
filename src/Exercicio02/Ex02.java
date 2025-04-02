package Exercicio02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = input.next();

        System.out.print("Digite sua senha: ");
        String password = input.next();

        // Referencia: https://regex101.com/
        while (true) {
            if(password.length() < 8){
                System.out.println("Senha deve ter mais de 8 caracteres\n");
            } else if (!password.matches(".*[A-Z].*")) {
                System.out.println("Senha deve conter pelo menos 1 letra maiúscula\n");
            } else if (!password.matches(".*[0-9].*")) {
                System.out.println("Senha deve conter pelo menos 1 numero\n");
            } else if (!password.matches(".*[@#$%&*!].*")) {
                System.out.println("Senha deve conter pelo menos um caracter especial\n");
            } else {
                System.out.println("Senha válida");
                break;
            }

            System.out.print("Digite novamente: ");
            password = input.next();

        }
    }
}
