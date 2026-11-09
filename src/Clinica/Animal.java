package Clinica;

public abstract class Animal {
//protected  para que sean visibles para las subclases

    protected String nombre;
    protected int edad;
    protected String titular;

    public abstract double calcularCostoConsulta();

    public Animal(String nombre, int edad, String titular) {
        this.nombre = nombre;
        this.edad = edad;
        this.titular = titular;
    }

    public void imprimirFicha() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dueño: " + titular);
        System.out.println("Costo consulta: $" + calcularCostoConsulta());
    }

}

