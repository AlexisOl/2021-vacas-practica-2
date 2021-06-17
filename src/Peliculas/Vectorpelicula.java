package src.Peliculas;
import src.tienda.*;
import src.clientes.Cliente;

public class Vectorpelicula {

    private pelicula[] peliculas = new pelicula[50];
    private int siguienteCodigo;

    public Vectorpelicula(){
        siguienteCodigo = 1;
    }

    //agregar clientes
    public void agregarPeliculas(String nombre, int año, String categoria){
        if (siguienteCodigo > 50){
            System.out.println("Límite de clientes alcanzado");
        }
        else{
            peliculas[(siguienteCodigo-1)] = new pelicula(siguienteCodigo, nombre, año, categoria);
        }
        siguienteCodigo++;
    }

    public void agregarPeliculas(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula");
        int año = IngresoDatos.getEntero("Ingrese el año", false);
        String categoria = IngresoDatos.getTexto("INgrese la categoria");
        agregarPeliculas(nombre, año, categoria);
    }



    // fin agregar clientes

    public void mostrarPeliculas(){
        System.out.println("\n\n Clientes de memorabilia");
        for (int i = 0; i < (siguienteCodigo-1); i++) {
            System.out.println("-"+i+") "+peliculas[i].getInformacion());
            //System.out.println("-"+i+") "+clientes[i].getId() + " nombre "+clientes[i].getNombre()+ " telefono "+clientes[i].getTelefono());

        }

        System.out.println("\n\n");
    }


    //Ordenamiento
    public void ordenarPorNombre(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (siguienteCodigo-1); i++) {
            for (int j = 0; j < (siguienteCodigo-1-i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente)
                    cambio= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) > 0 );
                else
                    cambio= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) < 0 );

                if(cambio ){
                    //clientes i va antes que clientes j <0 descendente
                    pelicula aux = peliculas[j];
                    peliculas[j] = peliculas[j+1];
                    peliculas[j+1]= aux;
                }
            }
        }

    }

}
