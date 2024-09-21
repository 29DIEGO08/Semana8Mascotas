package com.example;

public class Pajaro extends Mascota {

    public Pajaro(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("pio pio");
    }

    @Override
    public void alimentar() {
        System.out.println("El pajaro se alimenta comida comida.");
    }

    @Override
    public void cuidar() {
        System.out.println("El pajaro necesita, baños, paseos, etc");
    }
}
