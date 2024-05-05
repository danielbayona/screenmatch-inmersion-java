import modelo.Pelicula;
import modelo.Serie;
import java.util.Scanner;

public class Principal {
    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        while(opcion != 9){
            String menu = """
                    Bienvenido(a) a Screenmatch
                    1) Registrar nueva película
                    2) Registrar nueva serie
                    3) Calculadora
                    9) Salir
                    
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    diligenciarInformacion(teclado,"Pelicula");
                    break;
                case 2:
                    diligenciarInformacion(teclado,"Serie");
                    break;
                case 3:
                    calculaMaratonEnHoras(teclado);

                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no válida");
                    break;
            }

        }
    }

    private static void calculaMaratonEnHoras(Scanner teclado) {
        System.out.println("Ingrese el número de series a calcular");
        int numSeries = teclado.nextInt();
        int sumaDuracionesSeries = 0;
        int duracionEnesima=0;
        teclado.nextLine();
        for (int i = 0; i < numSeries; i++) {
            System.out.println("Ingrese la duración en minutos de la serie "+i);
            duracionEnesima= teclado.nextInt();
            teclado.nextLine();
            sumaDuracionesSeries+=duracionEnesima;
        }
        System.out.println("Se requieren "+(sumaDuracionesSeries/60)+" horas para ver la película");
    }

    void diligenciarInformacion(Scanner teclado, String tipoDeTitulo){
        System.out.println("Ingrese el nombre del título");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el año de lanzamiento: ");
        int fechaDeLanzamiento = teclado.nextInt();
        teclado.nextLine();
        switch(tipoDeTitulo){
            case "Pelicula":
                System.out.println("Ingrese la duración en minutos de la película");
                int duracionEnMinutos = teclado.nextInt();
                teclado.nextLine();

                Pelicula peliculaUsuario = new Pelicula();
                peliculaUsuario.setNombre(nombre);
                peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                peliculaUsuario.muestraFichaTecnica();
                break;
            case "Serie":
                System.out.println("Ingrese el número de temporadas");
                int temporadas = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingrese el número de episodios por temporada");
                int numeroDeEpisodiosPorTemporada = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingrese la duracion en minutos por episodio");
                int duracionEnMinutosPorEpisodio = teclado.nextInt();
                teclado.nextLine();

                Serie serieUsuario = new Serie();
                serieUsuario.setNombre(nombre);
                serieUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                serieUsuario.setTemporadas(temporadas);
                serieUsuario.setEpisodiosPorTemporada(numeroDeEpisodiosPorTemporada);
                serieUsuario.setDuracionEnMinutosPorEpisodio(duracionEnMinutosPorEpisodio);
                serieUsuario.muestraFichaTecnica();
                break;
        }
    }
}
