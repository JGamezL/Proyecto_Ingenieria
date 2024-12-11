public class Main {
    public static void main(String[] args) {

        Bebida cafe = new Cafe();
        System.out.println(cafe.descripcion() + " cuesta: " + "L" + cafe.costo());

        cafe = new Leche(cafe);
        System.out.println(cafe.descripcion() + " cuesta: " + "L" + cafe.costo());

        cafe = new Azucar(cafe);
        System.out.println(cafe.descripcion() + " cuesta: " + "L" + cafe.costo());

        // Suponiendo que piden leche extra
        cafe = new Leche(cafe);
        System.out.println(cafe.descripcion() + " cuesta: " + "L" + cafe.costo());

    }
}
