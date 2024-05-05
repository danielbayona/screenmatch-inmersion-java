import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión Java!");
        //System.out.println("Película Matrix");
        //Declaración de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película de fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3.0) / 3;
        System.out.println("Media de la evaluación de Matrix: "+ mediaEvaluacion);

        if(fechaDeLanzamiento > 2023){
            System.out.println("Película popular en el momento");
        }else{
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darás a Matrix: ");
            double notaMatrix = teclado.nextDouble();

            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula " +
                "Matrix calculada por el usuario es: " + mediaEvaluacionUsuario/3);
    }
}