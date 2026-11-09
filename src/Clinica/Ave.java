package Clinica;

public class Ave extends Animal{
double pesoGramos;

    public Ave(String nombre, int edad, String titular,double pesoGramos) {
        super(nombre, edad, titular);
        this.pesoGramos =  pesoGramos;
    }
    @Override
    public double calcularCostoConsulta() {
        double costo= 28000 + (100 * this.pesoGramos);
        return costo;

    }
}
