package Peliculas;


import src.clientes.Cliente;
import src.tienda.*;
import src.tienda.*;
public class vectorPeliculas {
    private pelicula[] simon = new Peliculas.pelicula[50];
    private int siguienteCodigo;

    public vectorPeliculas(){
        siguienteCodigo = 1;
    }

    //agregar peliculas
    public void agregarPeliculas(String nombre, int año, String categoria){
        if (siguienteCodigo > 50){
            System.out.println("Límite de clientes alcanzado");
        }
        else{
            pelicula[(siguienteCodigo-1)] = new pelicula(siguienteCodigo, nombre, año, categoria);
        }
        siguienteCodigo++;
    }


    public void agregarPeliculas(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula");
        int año = IngresoDatos.getEntero("Ingrese el número de telefono", false);
        String categoria= IngresoDatos.getTexto("INgrese la categoria");
        agregarCliente(nombre, año, categoria);
    }



    // fin agregar clientes

    public void mostrarPeliculas(){
        System.out.println("\n\n Peliculas de memorabilia");
        for (int i = 0; i < (siguienteCodigo-1); i++) {
            System.out.println("-"+i+") "+pelicula[i].getInformacion());
            //System.out.println("-"+i+") "+clientes[i].getId() + " nombre "+clientes[i].getNombre()+ " telefono "+clientes[i].getTelefono());

        }

        System.out.println("\n\n");
    }


}
