package impl;

public abstract class Electronico implements IElectronico, IProducto{

    private String fabricante;

    public Electronico(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

}
