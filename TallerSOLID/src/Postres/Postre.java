/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author edwin
 */
public abstract class Postre {
    
    private String sabor;
    public double precioParcial;
    public ArrayList<Aderezo> aderezos;
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
    
    public Postre(String sabor){
    aderezos = new  ArrayList<>();
    this.sabor=sabor;
    }
    
    public void anidirAderezo(Aderezo aderezo){
    aderezos.add(aderezo);}
    
    public void quitarAderezo(Aderezo aderezo){
    aderezos.remove(aderezo);}
    
}
