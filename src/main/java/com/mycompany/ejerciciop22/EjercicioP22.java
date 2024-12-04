/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciop22;
import java.util.Scanner;
public class EjercicioP22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese el salario basico por hora: ");
        double salarioPorHora = entrada.nextDouble();

        System.out.println("Ingrese el numero de horas trabajadas en el mes: ");
        int horasTrabajadas = entrada.nextInt();

        Empleado empleado = new Empleado(nombre, salarioPorHora, horasTrabajadas);

        empleado.mostrarInformacion();

    }
}

