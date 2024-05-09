/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipacifico.edu.jugueteria.presentacion;

import unipacifico.edu.jugueteria.logica.JugueteBebe;
import unipacifico.edu.jugueteria.logica.JugueteImportado;

/**
 *
 * @author ALUMNO-
 */
public class UsaJugueria {
   public static void main(String [] args){
   
       JugueteImportado importado = new JugueteImportado(" Minion");
       System.out.println("precios de minion: " + importado.calcularPrecio());
       
       JugueteBebe bebe = new JugueteBebe("poliester");
       System.out.println("Juguete bebe: " + bebe.calcularPrecio());
   }
}
