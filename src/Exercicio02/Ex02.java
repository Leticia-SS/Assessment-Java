package Exercicio02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = input.next();

        System.out.println("Digite sua senha: ");
        String password = input.next();

        boolean validLenght = (password.length() > 8);
        boolean validNumber = false;
        boolean validChar = false;

        if (validLenght) {
            for(var letter : password.toCharArray()) {
                if (letter >= 0 || letter <= 9) {
                    validNumber = true;
                }
            }
        }
    }
}
