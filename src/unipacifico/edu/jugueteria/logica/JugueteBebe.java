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
public class JugueteBebe extends JugueteImportado{
    private  final String MATERIAL_DEFAULT = "gamuza";
    private String material;

    public JugueteBebe() {
    super();
    this.material= this.MATERIAL_DEFAULT;
    }
    
    public JugueteBebe(String material){
    super();
    this.material = material;
    }

    public JugueteBebe(String material, String marca, String paisOrigen, double precio) {
        super(marca, paisOrigen, precio);
        this.material = material;
    }
    @Override
    public double calcularPrecio(){
      if(this.material.equals(this.MATERIAL_DEFAULT))
        return super.calcularPrecio() *1.3; 
      else{
        return super.calcularPrecio() *0.9;
      }   
    }
    
    
 
    



}
