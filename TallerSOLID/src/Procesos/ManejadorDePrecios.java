/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;
import Postres.*;
import Postres.Helado;
import Postres.Pastel;

/**
 *
 * @author USER
 */
public class ManejadorDePrecios {
    

   public  static  double calcularPrecioFinal(Object postre){
        double precioFinal;
        Postre postre1=(Postre)postre;
        double precioParcial=postre1.getPrecioParcial();
        
        if(postre.getClass() == Pastel.class){
            precioFinal=(precioParcial+(precioParcial*0.12))+(postre1.getAderezos().size()*0.50);
            return precioFinal;
        }else{
            precioFinal=(precioParcial+(precioParcial*0.12))+(postre1.getAderezos().size()*0.50);
            return precioFinal;
        }
  
   
}
       public static  String showPrecioFinal(Object postre){

        if(postre.getClass() == Pastel.class){
            return "Precio Final: $ " + calcularPrecioFinal(postre);
        }else{
            return "Precio Final: $ " + calcularPrecioFinal(postre);
        }
   
}}