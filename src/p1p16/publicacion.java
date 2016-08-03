/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1p16;

/**
 *
 * @author Edwin
 */
public class publicacion {
    private String titulo;
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void mostrar_datos(){
        System.out.println("El titulo es: "+titulo);
        
    }
}
