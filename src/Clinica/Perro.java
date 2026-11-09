package Clinica;

public class Perro extends Animal implements Vacunable,Asegurable{

    String raza;
    private int vacunasAplicadas = 0;

    public Perro(String nombre, int edad, String titular, String raza) {
        super(nombre, edad, titular);
        this.raza = raza;
    }
    @Override
    public double calcularCostoConsulta() {
        return 45000 +(3000 * this.edad);

    }
    @Override
    public void registrarVacuna(String nombre) {
        vacunasAplicadas++;
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunasAplicadas;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80000 * this.edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POLIZA-GUAU-" + nombre.toUpperCase();
    }
}
