
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walter
 */
public class ListaRep {
    
    private String nombre;
    private int contLikes;
        ArrayList<Cancion> ListCanciones  = new ArrayList();

    public ListaRep() {
    }

    public ListaRep(String nombre, int contLikes) {
        this.nombre = nombre;
        this.contLikes = contLikes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContLikes() {
        return contLikes;
    }

    public void setContLikes(int contLikes) {
        this.contLikes = contLikes;
    }

    public ArrayList<Cancion> getListCanciones() {
        return ListCanciones;
    }

    public void setListCanciones(ArrayList<Cancion> ListCanciones) {
        this.ListCanciones = ListCanciones;
    }

    @Override
    public String toString() {
        return "ListaRep{" + "nombre=" + nombre + ", contLikes=" + contLikes + ", ListCanciones=" + ListCanciones + '}';
    }
    
    
    
}
