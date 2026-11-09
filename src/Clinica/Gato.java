package Clinica;

public class Gato extends Animal implements Vacunable, Asegurable{

    boolean esEsterilizado;
    private int vacunasAplicadas = 0;

    public Gato(String nombre, int edad, String titular,boolean esEsterilizado) {
        super(nombre, edad, titular);
        this.esEsterilizado = esEsterilizado;
    }
    @Override
    public double calcularCostoConsulta() {
        return 38000;

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
        if(esEsterilizado){
            return 120000;
        }else{
            return 200000;
        }

    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POLIZA-MIAU-" + nombre.toUpperCase();
    }


}
