
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walter
 */
public class Album extends Lanzamiento implements Serializable{
    
    
    ArrayList<Cancion> canciones = new ArrayList();
   private int cantCanciones;

    public Album() {
    }

    public Album(String tittulo, String fechaPub, int contLike,int cantCanciones) {
        super(tittulo, fechaPub, contLike);
        this.cantCanciones = cantCanciones;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getCantCanciones() {
        return cantCanciones;
    }

    public void setCantCanciones(int cantCanciones) {
        this.cantCanciones = cantCanciones;
    }


 

    @Override
    public String toString() {
        return "Album{" + "canciones=" + canciones + ", cantCanciones=" + cantCanciones + '}';
    }
    
    
    
}
