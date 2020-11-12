/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.Aderezo;
import Adicionales.Crema;
import Adicionales.Frutilla;
import Postres.*;
import Procesos.*;
import Leche.*;
import java.util.ArrayList;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Finalmente mostrar el precio final de cada uno
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Deslactosada
        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche(new LecheDescremada());
        
        // Producir Helado
        Postre helado_vainilla = new Helado("Vainilla");
        arrPostres.add(helado_vainilla);
        // Producir Pastel
        Postre pastel_chocolate = new Pastel("Chocolate");
        arrPostres.add(pastel_chocolate);
        
        arrPostres.forEach(postre -> {
            postre.anidirAderezo(new Crema());
            postre.anidirAderezo(new Frutilla());
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(postre);
            System.out.println(ManejadorDePrecios.showPrecioFinal(postre));
        });
        
         //Se hace el mismo procedimiento pero con leche deslactosada
         ManejadorDeLeche mnj_leche2 = new ManejadorDeLeche(new LecheDeslactosada());
         arrPostres.forEach(postre -> {
             postre.anidirAderezo(new Crema());
             postre.anidirAderezo(new Frutilla());
             System.out.println(postre);
             mnj_leche2.cambiarTipoLeche(postre);
             System.out.println(ManejadorDePrecios.showPrecioFinal(postre));
         });
        
    }


}
