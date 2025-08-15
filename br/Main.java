package br;

import java.util.Scanner;

public class Main {
    private final static String WELCOME_MESSAGE = "Olá! aqui estão as aulas do primeiro módulo, por favor digite seus dados."; // declaração de constantes

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        System.out.println("Informe seu nome: ");
        String name = scanner.next();
        System.out.println("Informe a sua idade");
        int age = scanner.nextInt();
        System.out.printf("Olá %s você tem %s anos!", name, age);

        scanner.close();
    }
}
