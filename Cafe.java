public class Cafe implements Bebida {
    @Override
    public String descripcion() {
        return "Café";
    }

    @Override
    public double costo() {
        return 10.5;
    }
}
