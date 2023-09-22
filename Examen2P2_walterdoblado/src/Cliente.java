
import java.io.Serializable;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author walter
 */
public class Cliente extends Usuario implements Serializable{

    ArrayList<Cancion> cancionFav = new ArrayList();
    ArrayList<ListaRep> listaRep = new ArrayList();
    ArrayList <ListaRep>listaLike = new ArrayList();

    public Cliente(String UserName, String contra, int edad) {
        super(UserName, contra, edad);
    }

    public Cliente() {
    }

    public ArrayList<Cancion> getCancionFav() {
        return cancionFav;
    }

    public void setCancionFav(ArrayList<Cancion> cancionFav) {
        this.cancionFav = cancionFav;
    }

    public ArrayList<ListaRep> getListaRep() {
        return listaRep;
    }

    public void setListaRep(ArrayList<ListaRep> listaRep) {
        this.listaRep = listaRep;
    }

    public ArrayList<ListaRep> getListaLike() {
        return listaLike;
    }

    public void setListaLike(ArrayList<ListaRep> listaLike) {
        this.listaLike = listaLike;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cancionFav=" + cancionFav + ", listaRep=" + listaRep + ", listaLike=" + listaLike + '}';
    }

    

}
