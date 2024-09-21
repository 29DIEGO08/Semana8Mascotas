package com.example;

public class Gato extends Mascota {

    public Gato(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println(" Miau Miau");
    }

    @Override
    public void alimentar() {
        System.out.println("El gato se alimenta comida comida.");
    }

    @Override
    public void cuidar() {
        System.out.println("El gato necesita, baños, paseos, etc");
    }
}
