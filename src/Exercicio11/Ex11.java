package Exercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        List<Short> numbers = new ArrayList<Short>(6);
        List<Short> randoms = new ArrayList<Short>(6);
        Random random = new Random();
        short counter = 1;
        short totalRight = 0;

        System.out.println("Digite 6 números entre 1 e 60:");

        while (counter<7) {
            System.out.printf("%d° número: ", counter);
            short guess = input.nextShort();
            short lucky = (short)random.nextInt(61);

            while (guess<1 || guess>60){
                System.out.println("Número inválido, somente entre 1 e 60");
                System.out.print("Digite novamente: ");
                guess = input.nextShort();
            }
            while (numbers.contains(guess)){
                System.out.print("Número já escolhido, insira outra opção: ");
                guess = input.nextShort();
            }
            while(randoms.contains(lucky)){
                lucky = (short)random.nextInt(61);
            }

            randoms.add(lucky);
            numbers.add(guess);
            counter++;
        }
        for(short num : numbers){
            if(randoms.contains(num)){
                totalRight++;
            }
        }
        System.out.println("Números sorteados: " + randoms);
        System.out.println("Seus acertos: " + totalRight);

    }
}
