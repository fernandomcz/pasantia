/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipacifico.edu.jugueteria.logica;

/**
 *
 * @author ALUMNO-
 */
public class JugueteImportado {
    
    private final String MARCA_DEFAULT ="Fisherprice";
    private final String PAIS_ORIGEN_DEFAULT ="China";
    private final double PRECIO_DEFAULT =50000;
   
    private String marca;
    private String paisOrigen;
    private double precio;

    public JugueteImportado() {
        this.marca = this.MARCA_DEFAULT;
        this.paisOrigen = this.PAIS_ORIGEN_DEFAULT;
        this.precio = this.PRECIO_DEFAULT;
    }
    
    public JugueteImportado(String marca) {
     this.marca = marca;
     this.paisOrigen = this.PAIS_ORIGEN_DEFAULT;
     this.precio = this.PRECIO_DEFAULT;
     
    }
    public JugueteImportado(String marca, String paisOrigen, double precio) {
        this.marca = marca;
        this.paisOrigen = paisOrigen;
        this.precio = precio;
    }
    
    public double calcularPrecio(){
      double precioAPagar = this.precio;
      double variabilidad =0.0;
      
      if( !this.paisOrigen.equals( this.PAIS_ORIGEN_DEFAULT)){
       variabilidad= this.precio *0.2;
      }
      
      if( !this.marca.equals(this.MARCA_DEFAULT)){
      variabilidad = variabilidad - (this.precio * 0.05);
      }
      
      precioAPagar +=variabilidad;
      
      return precioAPagar;
    }
    
    
}
