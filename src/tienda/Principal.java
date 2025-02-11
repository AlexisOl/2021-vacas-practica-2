package src.tienda;

import src.clientes.Cliente;

import src.Peliculas.pelicula;
import src.Peliculas.Vectorpelicula;
import src.clientes.*;
import src.Peliculas.pelicula;
import src.Peliculas.*;
public class Principal {

    public static void main(String[] args){
        Principal p = new Principal();
    }

    private VectorClientes tablaClientes = new VectorClientes();
    private Vectorpelicula tablaPelicula = new Vectorpelicula();
    public Principal(){

        int menu = 0;

        while(menu >= 0){
            System.out.println("Bienvenido a memorabilia \n\n");
            System.out.println("1) Ingreso de clientes");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Ordenar Clientes Ascente");
            System.out.println("4) Ordenar Clientes Descendente");
            System.out.println("5| ingreso de peliculas");
            System.out.println("6| Mostrar peliculas" );
            System.out.println("7| ordenar peliculas ascendente");
            System.out.println("8) ordenar peliculas descendente");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            if (menu == 1 ){
                //ingreso de datos
                tablaClientes.agregarCliente();
            }
            if (menu == 2){
                //mostrar clientes
                tablaClientes.mostrarClientes();
            }
            if (menu == 3){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(true);
                tablaClientes.mostrarClientes();
            }
            if (menu == 4){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(false);
                tablaClientes.mostrarClientes();
            }

            if (menu == 5 ){
                //ingreso de datos de peliculas
                tablaPelicula.agregarPeliculas();
            }
            if (menu == 6){
                //mostrar peliculas
                tablaPelicula.mostrarPeliculas();
            }
            if (menu == 7){
                //mostrar peliculas ordenadas ascendente
                System.out.println("Desordenado:");
                tablaPelicula.mostrarPeliculas();
                System.out.println("\n\nOrdenado:");
                tablaPelicula.ordenarPorNombre(true);
                tablaPelicula.mostrarPeliculas();

            }
            if (menu == 8){
                //mostrar peliculas ordenadas ascendente
                System.out.println("Desordenado:");
                tablaPelicula.mostrarPeliculas();
                System.out.println("\n\nOrdenado:");
                tablaPelicula.ordenarPorNombre(false);
                tablaPelicula.mostrarPeliculas();

            }

        }

    }

    
}
