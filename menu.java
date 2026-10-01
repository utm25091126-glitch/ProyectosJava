import Animales.*;
import Empleados.*;
import java.util.ArrayList;
public class menu{
    public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Circulo(5));
        figuras.add(new Cuadrado(4));
        figuras.add(new Circulo(3));
        figuras.add(new Cuadrado(2));
        figuras.add(new Circulo(1));

        double sumaAreas = 0;
        for (Figura f : figuras) {
            sumaAreas += f.CalcularArea();
        }
        System.out.println("La suma de las áreas es: " + sumaAreas);


        // Animales
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Fido", 3));
        animales.add(new Pajaro("Pidgey", 1));
        animales.add(new Pajaro("Cuca",4));

        System.out.println("Hay " + animales.size() + " animales en la lista.");
        for (Animal a : animales){
            System.out.println(a);
            a.comer();
            a.hacerSonido();
            if (a instanceof Volador) {
                ((Volador) a).volar();
            }
            System.out.println();
        }

        // Empleados
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Gerente("Juan", 15000, 2000));
        empleados.add(new Vendedor("María", 10000, 1500));
        empleados.add(new Vendedor("Pedro",10000,10000));
        empleados.add(new Gerente("Carlos",15000,2000));

        //En el ArrayList de empleados, usa un bucle para encontrar quién tiene el sueldo más alto, sin ordenar la lista, solo comparando mientras recorres.
        Empleado empleadoConMayorSueldo = empleados.get(0);
        for (Empleado e : empleados) {
            if (e.calcularSalario() > empleadoConMayorSueldo.calcularSalario()) {
                empleadoConMayorSueldo = e;
            }
        }
        System.out.println("El empleado con el salario más alto es: " + empleadoConMayorSueldo.getNombre() + " con un salario de: " + empleadoConMayorSueldo.calcularSalario());
        
    }
}
