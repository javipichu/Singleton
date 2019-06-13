/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author javiv
 */
public class ejemplosingleton {

     private static ejemplosingleton varSinglenton; // = null;
    
     private String nombre = "david";
     
     
     private int numero = 2;
     
     private float decimales =  4.5f;

    public static ejemplosingleton getVarSinglenton() {
        return varSinglenton;
    }

    public static void setVarSinglenton(ejemplosingleton varSinglenton) {
        ejemplosingleton.varSinglenton = varSinglenton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getDecimales() {
        return decimales;
    }

    public void setDecimales(float decimales) {
        this.decimales = decimales;
    }
     
     
    private  ejemplosingleton() {
        
        
        
    }
    
    public static ejemplosingleton getInstance(){
    
    if (varSinglenton == null){
    varSinglenton = new ejemplosingleton();
    
    } 
    
    return varSinglenton;
            
    }

    @Override
    public String toString() {
        return "Singlenton{" + "nombre=" + nombre + ", numero=" + numero + ", decimales=" + decimales + '}';
    }
    
    
    
}