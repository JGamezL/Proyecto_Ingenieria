public class Leche extends DecoradorBebida {
    public Leche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + ", Leche";
    }

    @Override
    public double costo() {
        return bebida.costo() + 2.5;
    }
}
