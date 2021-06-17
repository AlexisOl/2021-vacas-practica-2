package Peliculas;

public class pelicula {

    private int id;
    private String nombre;
    private int año;
    private String categoria;

    public pelicula(){

    }
    public pelicula(int id,String nombre, int año, String categoria){
        this.id=id;
        this.nombre=nombre;
        this.año=año;
        this.categoria=categoria;
    }
    public void setAño(int año) {
        this.año = año;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAño() {
        return año;
    }

    @Override
    public String toString() {
        return "pelicula{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", año=" + año +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
