public class Soda extends Product{
    private double content;

    public Soda(String name, double cont, int value) {
        super(value, name);
        this.content = cont;
    }
    @Override
    public String toString() {
        return " /// Litros:  " + this.content + " /// Precio: $" + this.getValue();
    }
}
