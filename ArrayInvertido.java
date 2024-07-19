package org.example;

// O objetivo desse exercício é escrever uma função que retorne um array invertido //

import java.util.Scanner;

public class ArrayInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean quantidadeValida = false;
        int quantidade = 0;

        while (!quantidadeValida) {
            System.out.println("Quantos números este array vai ter? ");
            try {
                quantidade = scanner.nextInt();
                scanner.nextLine();

                int[] numeros = new int[quantidade];
                quantidadeValida = true;

                for (int i = 0; i < quantidade; i++) {
                    boolean numeroValido = false;

                    while (!numeroValido) {

                        try {
                            System.out.println("Digite o " + (i + 1) + "º número");
                            int numero = scanner.nextInt();
                            scanner.nextLine();
                            numeros[i] = numero;
                            numeroValido = true;
                        } catch (Exception e) {
                            System.out.println("Por favor digite um numero valido");
                            scanner.nextLine();
                            System.out.println("____________________________________________");
                        }
                    }
                }
                System.out.println("Array na ordem dada: ");
                for (int numero: numeros) {
                    System.out.println(numero);
                }

                System.out.println("____________________________________");

                System.out.println("Array invertido:");
                int[] numerosInvertidos = inverterArray(numeros);

                for (int numeroInvertido: numerosInvertidos) {
                    System.out.println(numeroInvertido);
                }

            } catch (Exception e) {
                System.out.println("Por favor digite um numero valido");
                scanner.nextLine();
                System.out.println("____________________________________________");
            }

        }

        scanner.close();
    }

    public static int[] inverterArray(int[] numeros) {
        int[] numerosInvertidos = new int[numeros.length];
        int[] arrayAuxiliar = numeros;
        int aux = 0;

        for (int i = numeros.length - 1; i>=0; i--) {
            numerosInvertidos[aux] = arrayAuxiliar[i];

            aux++;
        }

        return numerosInvertidos;
    }

}
