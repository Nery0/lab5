/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author falbo
 */


// Clase Operario

public class Operario extends Empleado {
     private double sueldoBasico;
    private int horasExtras;

    public Operario(String nombre, String dni, double sueldoBasico, int horasExtras) {
        super(nombre, dni);
        this.sueldoBasico = sueldoBasico;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return sueldoBasico + (horasExtras * 1.5) + (sueldoBasico * 0.1);
    }
}
