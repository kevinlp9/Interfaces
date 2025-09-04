package test;

import impl.IProducto;
import impl.Libro;
import impl.Producto;
import impl.Electronico;
import impl.clases.IPhone;
import impl.clases.TvLcd;
import impl.clases.Comics;

import java.util.Date;

public class ProyectoCatalogo {

    public static void main(String[] args) {

        Date Date = new Date();

        IProducto[] producto = new Producto[10];
        
        producto[0] = new IPhone("Apple", "iPhone 15 Pro", "Negro");
        producto[1] = new IPhone("Apple", "iPhone 15", "Azul");
        producto[2] = new TvLcd("Samsung", 40);
        producto[3] = new TvLcd("LG", 40);
        producto[4] = new Comics(500, new Date(92, 5, 8) , "Marvel","Marvel", "Batman", "Batman");
        producto[5] = new Comics(1000, new Date(78, 6, 8), "DC Comics, Inc.", "DC Comics, Inc.", "Superman", "Superman");
        producto[6] = new Comics(600, new Date(89, 6, 7), "DC Comics, Inc.", "DC Comics, Inc.", "Superman", "Superman");
        producto[7] = new Comics (800, new Date(99, 7, 7), "DC Comics, Inc.", "DC Comics, Inc.", "Superman", "Superman");
        producto[8] = new IPhone("Apple", "iPhone 15 Pro Max", "Negro");
        producto[9] = new TvLcd("Sony", 55);


        for (IProducto p : producto) {
            System.out.println(p.getPrecioVenta());
        }

    }
    
}
