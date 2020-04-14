
package cineinterfaz;

public class Peliculas {
    private String nombre; 
    private String director;
    private String año;
    private String reseña;

    public Peliculas(String nombre, String director, String año, String reseña) {
        this.nombre = nombre;
        this.director = director;
        this.año = año;
        this.reseña = reseña;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getAño() {
        return año;
    }
    public void setAño(String año) {
        this.año = año;
    }
    public String getReseña() {
        return reseña;
    }
    public void setReseña(String reseña) {
        this.reseña = reseña;
    }
    @Override
    public String toString() {
        return ("Nombre: " + nombre + "\nDirector: " + director + "\nAño: "+ año + "\nReseña: "+ reseña);
    }
}
