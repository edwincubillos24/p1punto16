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
public class libro extends publicacion{
    
    private int paginas, year;
   

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setYear(int year) {
        this.year = year;
    }

public void mostrar(){
        System.out.println("Las paginas son: "+paginas);
        System.out.println("El año es: "+year);
        
    }
    
}
