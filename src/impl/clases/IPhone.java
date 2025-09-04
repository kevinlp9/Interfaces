package impl.clases;

import impl.Electronico;

public class IPhone extends Electronico {

    private String modelo;
    private String color;

    public IPhone(String fabricante, String modelo, String color) {
        super(fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public int getPrecio() {
        return 0;
    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }
}
