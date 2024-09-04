package HashSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        // UNA COLECCIÓN ES UN OBJETO QUE AGRUPA MULTIPLES ELMENTOS EN UNA SOLA UNIDAD
        // LIST, SET, QUEUE, MAP

        System.out.println("Bienvenidos a la fiesta de superHeroes");

        // SET --> HASH SET 
        // NO SE PUEDEN REPETIR LOS ELEMENTOS

        Set<String> coleccionSuperHeroes = new HashSet<>();

        coleccionSuperHeroes.add("Spiderman"); //1
        coleccionSuperHeroes.add("Batman"); //2
        coleccionSuperHeroes.add("Hulk"); //3
        coleccionSuperHeroes.add("Irom man"); //4
        coleccionSuperHeroes.add("Wonder woman"); // 5
        
        // LLEGO TARDE NUESTRO SUPERHEROE ESTRELLA
        coleccionSuperHeroes.add("Super man"); //6
        
        //BUSCAMOS SI ESTA SPIDERMAN
        if (coleccionSuperHeroes.contains("Spiderman")) {
            
            System.out.println("Spiderman esta en la fiesta :)");
        }
        
        //HULK SE RETIRA DE LA FIESTA
        
        coleccionSuperHeroes.remove("Hulk"); 
        
        if (!coleccionSuperHeroes.contains("Hulk")) {
            
            System.out.println("Hulk se fue de la fiesta :)");
        }

        //SUPERMAN SE FUE Y VOLVIO RAPIDO Y NO NOS DIMOS CUENTA (NO INGRESA A REPETIDOS)
        coleccionSuperHeroes.add("Super man");

        if (coleccionSuperHeroes.isEmpty()) {
            System.out.println("La fiesta termino , todos se fueron! ");
        }else{

            System.out.println("La fiesta continua aun hay " + coleccionSuperHeroes.size() + " Superheroes en la fiesta");
        }


        // QUIENES QUEDAN EN LA FIESTA
        // NO TIENE UN ORDEN :(

        System.out.println("-----¿Quienes estan aun en la fiesta?---");
        for (String superHeroe : coleccionSuperHeroes) {
            
            System.out.println(superHeroe);
        }


    }
}
