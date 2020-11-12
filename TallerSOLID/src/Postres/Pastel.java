/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

/**
 *
 * @author Pedro Mendoza
 */
public class Pastel extends Postre{
  
    
    public Pastel(String sabor){
        super(sabor);
        setPrecioParcial(15.55);
    }
    /*
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    */
        
    /*
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
    */
}
