package com.zuro.DesafioDBMusica.principal;

import com.zuro.DesafioDBMusica.modelo.Cancion;
import com.zuro.DesafioDBMusica.modelo.Cantante;
import com.zuro.DesafioDBMusica.repository.CancionRepository;
import com.zuro.DesafioDBMusica.repository.CantanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class Principal {

    @Autowired
    private CancionRepository cancionRepository;

    @Autowired
    private CantanteRepository cantanteRepository;

    Scanner teclado = new Scanner(System.in);

    public void muestraMenu(){

        boolean ciclo = true;

                while (ciclo){

                    var menu = """
                              \n
                              1 - Registrar cantantes
                              2 - Registrar canciones
                              3 - Eliminar cantantes
                              4 - Eliminar canciones
                              5 - Buscar canciones
                              6 - Buscar cantantes
                              
                              0 - Salir\n""";

                    System.out.println(menu);
                    var opcion = teclado.nextInt();
                    teclado.nextLine();

                    switch (opcion){

                        case 1:
                            registrarCantantes();
                            break;
                        case 2:
                            registrarCanciones();
                            break;
                        case 3:
                            eliminarCantantes();
                            break;
                        case 4:
                            eliminarCanciones();
                            break;
                        case 5:
                            buscarCanciones();
                            break;
                        case 6:
                            buscarCantante();
                            break;
                        case 0:
                            System.out.println("\nSaliendo de la aplicación\n");
                            ciclo = false;
                            break;
                    }

                }

    }

    private void registrarCantantes() {

        System.out.println("\nEscriba el nombre del cantante que desea agregar: \n");
        var nombreCantante = teclado.nextLine();

        Cantante cantante = new Cantante();
        cantante.setNombre(nombreCantante);

        System.out.println("\nEscriba el género de la persona (ej. Femenino, Masculino)\n");
        var genero= teclado.nextLine();
        cantante.setGenero(genero);

        System.out.println("\nEscriba la nacionalidad del cantante:\n");
        var nacionalidad= teclado.nextLine();
        cantante.setNacionalidad(nacionalidad);

        System.out.println("\nCantante añadido exitosamente!");
        cantanteRepository.save(cantante);


    }

    private void registrarCanciones() {

        System.out.println("\nEscriba el nombre de la canción que desea agregar: \n");
        var cancionadd = teclado.nextLine();

        Cancion cancion = new Cancion();
        cancion.setTitulo(cancionadd);

        System.out.println("\nEscriba el género de la canción: \n");
        var genero = teclado.nextLine();
        cancion.setGeneroMusical(genero);

        System.out.println("\nEscriba la duración de la canción en minutos: \n");
        var duracion = teclado.nextInt();
        cancion.setDuracion(duracion);

        System.out.println("\nCanción añadida exitosamente!");
        cancionRepository.save(cancion);

    }

    private void eliminarCantantes() {

        System.out.println("\nEscriba el nombre del cantante que desea eliminar: \n");
        var nombreCantante = teclado.nextLine();

        Cantante cantante = cantanteRepository.findByNombre(nombreCantante);

        if(cantante != null){

            System.out.println("\nCantante eliminado exitosamente\n");
            cantanteRepository.delete(cantante);

        }else{

            System.out.println("\nNo se encontro a ese cantante\n");

        }
    }

    private void eliminarCanciones() {

        System.out.println("\nEscriba el nombre de la canción que desea eliminar: \n");
        var nombreCancion = teclado.nextLine();

        Cancion cancion = cancionRepository.findByTitulo(nombreCancion);

        if(cancion != null){

            System.out.println("\nCanción eliminado exitosamente\n");
            cancionRepository.delete(cancion);

        } else{

            System.out.println("\nNo se encontro esa canción");

        }

    }

    private void buscarCanciones() {

        System.out.println("\nEscribe el nombre de la canción que deseas buscar: \n");
        var buscarCancion = teclado.nextLine();
        Cancion cancion = cancionRepository.findByTitulo(buscarCancion);

        if (cancion != null){

            System.out.println("\nCanción encontrada: " + cancion);

        } else {

            System.out.println("\nNo se encontró esa canción");

        }

    }

    private void buscarCantante() {

        System.out.println("\nEscribe el nombre de el cantante que deseas buscar: \n");
        var buscarCantante = teclado.nextLine();
        Cantante cantante = cantanteRepository.findByNombre(buscarCantante);

        if (cantante != null){

            System.out.println("\nCantante encontrado: " + cantante);

        } else {

            System.out.println("\nNo se encontró esa cantante");

        }
    }

}
