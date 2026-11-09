
package Clinica;

public class main {
    public static void main(String[] args) {

        Perro perro = new Perro("Pedro", 3, "Ana", "Labrador");
        Gato gato = new Gato("Destructor de mundos", 2, "Luis", true);
        Ave ave = new Ave("Piolin", 1, "Sofia", 90);

        System.out.println("== FICHAS ===");
        Animal[] animales = {perro, gato, ave};
        //para cada Animal al que llamare a, dentro de animales
        for (Animal a : animales) {
            a.imprimirFicha();
            System.out.println("------------");
        }

        System.out.println("===  VACUNAS ===");
        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("coronavirus");
        gato.registrarVacuna("larata");
        System.out.println(perro.nombre + " lleva " + perro.getVacunasAplicadas() + " vacunas");
        System.out.println(gato.nombre + " lleva " + gato.getVacunasAplicadas() + " vacunas");
        System.out.println("------------");


        System.out.println("===  POLIZA ===");
        Clinica clinica = new Clinica("NuncaJamas", "Calle 10 #20-30");
        Asegurable[] asegurables = {perro, gato, clinica};
        for (Asegurable s : asegurables) {
            System.out.println("Poliza: " + s.obtenerNumeroPoliza() + " | Prima anual: $" + s.calcularPrimaSeguro());
        }
        System.out.println("------------");

        System.out.println("===CONEJO ===");
        Animal[] animales2 = {perro, gato, ave, new Conejo("Bugs conejo", 1, "Pedro")};
        for (Animal a : animales2) {
            a.imprimirFicha();
            System.out.println("------------");
        }
    }
}

