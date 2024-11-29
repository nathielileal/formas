package com.lpoo.atividade03;

import java.util.ArrayList;
import java.util.Scanner;

public class UsaFormas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> areas = new ArrayList<>();

        System.out.print("Quantas formas deseja criar? ");

        int numFormas = scanner.nextInt();

        for (int i = 0; i < numFormas; i++) {
            System.out.println("Escolha a forma (1 - Circunferencia, 2 - Retangulo, 3 - Triangulo): ");

            int tipoForma = scanner.nextInt();

            switch (tipoForma) {
                case 1:
                    System.out.print("Informe o raio da circunferencia: ");

                    double raio = scanner.nextDouble();

                    try {
                        Circunferencia circ = new Circunferencia(raio);
                        areas.add(circ.area());
                    } catch (RuntimeException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }

                    break;

                case 2:
                    System.out.print("Informe o lado 1 do retangulo: ");

                    double lado1 = scanner.nextDouble();

                    System.out.print("Informe o lado 2 do retangulo: ");

                    double lado2 = scanner.nextDouble();

                    try {
                        Retangulo ret = new Retangulo(lado1, lado2);
                        areas.add(ret.area());
                    } catch (RuntimeException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }

                    break;

                case 3:
                    System.out.print("Informe a base do triangulo: ");

                    double base = scanner.nextDouble();

                    System.out.print("Informe a altura do triangulo: ");

                    double altura = scanner.nextDouble();

                    try {
                        Triangulo tri = new Triangulo(base, altura);
                        areas.add(tri.area());
                    } catch (RuntimeException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

            System.out.print("Deseja adicionar outra forma? (S/N): ");

            String continuar = scanner.next();

            if (continuar.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println("\nAreas das formas criadas:");

        for (double area : areas) {
            System.out.println(area);
        }

        scanner.close();
    }
}
