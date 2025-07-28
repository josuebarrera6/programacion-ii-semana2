package org.example;

import java.util.Scanner;

public class CalculadoraEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa tu año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();
        int edad = 2025 - anioNacimiento;
        System.out.println("Hola " + nombre + ", tu edad aproximada es: " + edad + " años.");
        scanner.close();
    }
}
