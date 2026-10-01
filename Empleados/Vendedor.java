package Empleados;

public class Vendedor extends Empleado {
    private double comisionAcum;
    

    public Vendedor(String nombre, double salarioBase, double comisionAcum) {
        super(nombre, salarioBase);
        this.comisionAcum = comisionAcum;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + comisionAcum;
    }
    
}
