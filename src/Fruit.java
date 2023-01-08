public class Fruit extends Product{
    private String sellUnit;

    public Fruit(String name, String unit, int value) {
        super(value, name);
        this.sellUnit = unit;
    }

    @Override
    public String toString() {
        return  " ///  Precio: $" + this.getValue() + " /// Unidad de venta: " + this.sellUnit;
    }
}
