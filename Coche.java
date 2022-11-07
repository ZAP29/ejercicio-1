/* 
->Crear una clase coche.
->Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
->Una función que incremente el número de puertas que tiene el coche.
->Crear un objeto miCoche en el main y añadirle una puerta.
->Mostrar el número de puertas que tiene el objeto.
*/

public class Coche {

    int puertas = 0;

    public int incrementoPuertas(int puertas){
        return this.puertas += puertas;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();

        System.out.println(miCoche.incrementoPuertas(4));
        
    }


}
