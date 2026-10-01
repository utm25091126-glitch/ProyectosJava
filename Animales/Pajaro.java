package Animales;

public class Pajaro extends Animal implements Volador {
    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " canta.");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " vuela en el cielo.");
    }
}