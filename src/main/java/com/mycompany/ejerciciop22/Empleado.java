/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciop22;
public class Empleado {

    private String nombre;
    private double salarioPorHora;
    private int horasTrabajadas;

    public Empleado(String nombre, double salarioPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalarioMensual() {
        return salarioPorHora * horasTrabajadas;
    }

    public void mostrarInformacion() {
        double salarioMensual = calcularSalarioMensual();
        System.out.print("Empleado: " + nombre);
        if (salarioMensual > 450000) {
            System.out.println(", Salario Mensual: $" + salarioMensual);
        } else {
            System.out.println();
        }
    }
}

