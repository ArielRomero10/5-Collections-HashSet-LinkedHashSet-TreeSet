import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Bienvenidos a la fiesta de superHeroes");
        // TREESET LE PUEDO PASAR UN FORMATO DE ORDEN
        Set<String> coleccionSuperHeroes = new TreeSet<>();

        coleccionSuperHeroes.add("Spiderman"); // 1
        coleccionSuperHeroes.add("Batman"); // 2
        coleccionSuperHeroes.add("Hulk"); // 3
        coleccionSuperHeroes.add("Irom man"); // 4
        coleccionSuperHeroes.add("Wonder woman"); // 5

        // LLEGO TARDE NUESTRO SUPERHEROE ESTRELLA
        coleccionSuperHeroes.add("Super man"); // 6

        // BUSCAMOS SI ESTA SPIDERMAN
        if (coleccionSuperHeroes.contains("Spiderman")) {

            System.out.println("Spiderman esta en la fiesta :)");
        }

        // HULK SE RETIRA DE LA FIESTA

        coleccionSuperHeroes.remove("Hulk");

        if (!coleccionSuperHeroes.contains("Hulk")) {

            System.out.println("Hulk se fue de la fiesta :)");
        }

        // SUPERMAN SE FUE Y VOLVIO RAPIDO Y NO NOS DIMOS CUENTA (NO INGRESA A
        // REPETIDOS)
        coleccionSuperHeroes.add("Super man");

        if (coleccionSuperHeroes.isEmpty()) {
            System.out.println("La fiesta termino , todos se fueron! ");
        } else {

            System.out
                    .println("La fiesta continua aun hay " + coleccionSuperHeroes.size() + " Superheroes en la fiesta");
        }

        // QUIENES QUEDAN EN LA FIESTA
        // TREESET ORDENA ALFABETICAMENTE SI YO NO LE ASIGNE UN ORDEN

        System.out.println("------¿Quienes estan aun en la fiesta?---------");
        for (String superHeroe : coleccionSuperHeroes) {

            System.out.println(superHeroe);
        }
    }
}
