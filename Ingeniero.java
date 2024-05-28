/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author falbo
 */

// Clase Ingeniero
public class Ingeniero extends Empleado {
    private double sueldoBasico;

    public Ingeniero(String nombre, String dni, double sueldoBasico) {
    super(nombre, dni);
    this.sueldoBasico = sueldoBasico;
    }

    @Override
    public double calcularSalario() {
    return sueldoBasico + (sueldoBasico * 0.1);
    }
    
}
