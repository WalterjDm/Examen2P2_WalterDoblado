
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walter
 */
public class Cancion implements Serializable{
    private  String titulo;
    private int duracion;
    private String ref;

    public Cancion() {
    }

    public Cancion(String titulo, int duracion, String ref) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.ref = ref;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", duracion=" + duracion + ", ref=" + ref + '}';
    }
    
    
    
}
