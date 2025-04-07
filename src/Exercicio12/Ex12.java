package Exercicio12;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] messages = new String[10];
        short counter = 0;

        System.out.print("Digite o nome do primeiro usuário: ");
        String user1 = input.nextLine();
        System.out.print("Digite o nome do segundo usuário: ");
        String user2 = input.nextLine();
        System.out.println("\n");
        String user = user1;

        while(counter < messages.length) {
            System.out.printf("%s, digite sua mensagem: ", user);
            String message = input.nextLine();

            messages[counter] = user + ": " + message;

            if (user.equals(user1)) {
                user = user2;
            } else {
                user = user1;
            }
            counter++;
        }

        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! \uD83D\uDE80");
        System.out.println("\n==========Histórico de Mensagens==========");
        for (String message : messages) {
            System.out.println(message);
        }
    }
}
