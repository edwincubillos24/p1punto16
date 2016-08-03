/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1p16;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class P1p16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        libro book = new libro();
        disco disk = new disco();
        int opc;
        do{
            System.out.println("Digite \n1.libro \n2.disco \n0.salir");
            opc = lector.nextInt();
            switch (opc) {
                    case 1 :  
                        System.out.println("Digite titulo");
                        book.setTitulo(lector.next());
                        System.out.println("Digite numero pagina");
                        book.setPaginas(lector.nextInt());
                        System.out.println("Digite numero año");
                        book.setYear(lector.nextInt());
                        System.out.println("Digite numero precio");
                        book.setPrecio(lector.nextInt());
                        book.mostrar_datos();
                        book.mostrar();
                        System.out.println("El precio es: "+book.getPrecio());
                    break;
                        
                    case 2 : break;
            }
            
            
        }while (opc==0);
    }
    
}
