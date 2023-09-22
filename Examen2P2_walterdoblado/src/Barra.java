/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.Color;
import javax.swing.JProgressBar;

/**
 *
 * @author walter
 */
public class Barra extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private int num;
 

    public Barra(JProgressBar barra, int num) {
        this.barra = barra;
        avanzar = true;
        vive = true;
        this.num = num;
       
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
            
                barra.setValue(barra.getValue() + num);
                if (barra.getValue() == 1000) {
                    vive = false;
                }
            } //FIN IF

            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }
}
