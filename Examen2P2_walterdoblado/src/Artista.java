
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walter
 */
public class Artista extends Usuario{
    private String NombreArt;
    ArrayList<Cancion> lista = new ArrayList();
     ArrayList <Cancion>album = new ArrayList();

    public Artista(String NombreArt, String UserName, String contra, int edad) {
        super(UserName, contra, edad);
        this.NombreArt = NombreArt;
    }

    public Artista() {
    }

    public String getNombreArt() {
        return NombreArt;
    }

    public void setNombreArt(String NombreArt) {
        this.NombreArt = NombreArt;
    }

    public ArrayList<Cancion> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cancion> lista) {
        this.lista = lista;
    }

    public ArrayList<Cancion> getAlbum() {
        return album;
    }

    public void setAlbum(ArrayList<Cancion> album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Artista{" + "NombreArt=" + NombreArt + ", lista=" + lista + ", album=" + album + '}';
    }

  
    
    
}
