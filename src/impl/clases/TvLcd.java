package impl.clases;

import impl.Electronico;

public class TvLcd extends Electronico {

    private int pulgada;

    public TvLcd(String fabricante, int pulgada) {
        super(fabricante);
        this.pulgada = pulgada;
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
