package Clinica;

public class Conejo extends Animal {

    public Conejo(String nombre, int edad, String titular) {
        super(nombre, edad, titular);
    }

    @Override
    public double calcularCostoConsulta() {
        return 35000;
    }
}
