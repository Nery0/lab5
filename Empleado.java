/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author falbo
 */
public abstract class Empleado {
    private String nombre;
    private String dni;

    public Empleado(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // aplicamos el metodo calcular el salario del Empleado
    public abstract double calcularSalario();
    
    public void funcionEmpleado(){
        System.out.println("Funcion generica");
    }
    
}
