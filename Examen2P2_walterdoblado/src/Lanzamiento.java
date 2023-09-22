
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walter
 */
public class Lanzamiento {
    
    private String tittulo;
    private String fechaPub;
    private int contLike;

    public Lanzamiento() {
    }

    public Lanzamiento(String tittulo, String fechaPub, int contLike) {
        this.tittulo = tittulo;
        this.fechaPub = fechaPub;
        this.contLike = contLike;
    }

    public String getTittulo() {
        return tittulo;
    }

    public void setTittulo(String tittulo) {
        this.tittulo = tittulo;
    }

    public String getFechaPub() {
        return fechaPub;
    }

    public void setFechaPub(String fechaPub) {
        this.fechaPub = fechaPub;
    }

    public int getContLike() {
        return contLike;
    }

    public void setContLike(int contLike) {
        this.contLike = contLike;
    }

    @Override
    public String toString() {
        return "Lanzamiento{" + "tittulo=" + tittulo + ", fechaPub=" + fechaPub + ", contLike=" + contLike + '}';
    }
    
    
    
}
