public class Azucar extends DecoradorBebida {
    public Azucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + ", Azúcar";
    }

    @Override
    public double costo() {
        return bebida.costo() + 2.0;
    }
}
