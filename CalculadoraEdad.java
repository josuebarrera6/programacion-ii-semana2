package org.example;

import java.util.Scanner;

public class CalculadoraEdad {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del usuario
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar el año de nacimiento
        System.out.print("Ingresa tu año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();

        // Calcular edad aproximada (usando 2025 como año actual)
        int edad = 2025 - anioNacimiento;

        // Imprimir mensaje
        System.out.println("Hola " + nombre + ", tu edad aproximada es: " + edad + " años.");

        // Cerrar el scanner
        scanner.close();
    }
}
