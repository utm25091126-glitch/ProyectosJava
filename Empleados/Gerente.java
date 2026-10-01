package Empleados;

public class Gerente extends Empleado {
    private double Bono;

    public Gerente(String nombre, double salarioBase, double Bono){
        super(nombre, salarioBase);
        this.Bono=Bono;
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase() + Bono;
    }

} 
    

