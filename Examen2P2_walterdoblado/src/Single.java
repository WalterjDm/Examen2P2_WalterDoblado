
import java.io.Serializable;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author walter
 */
public class Single extends Lanzamiento implements Serializable{

    Cancion cancion;

    public Single() {
    }

    public Single(Cancion cancion, String tittulo, String fechaPub, int contLike) {
        super(tittulo, fechaPub, contLike);
        this.cancion = cancion;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return "Single{" + "cancion=" + cancion + '}';
    }

    
    
}
