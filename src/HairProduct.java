public class HairProduct extends Product{
    private String content;

    public HairProduct(String name, String cont, int value) {
        super(value, name);
        this.content = cont;
    }

    @Override
    public String toString() {
        return " /// Contenido:  " + this.content + " /// Precio: $" + this.getValue();
    }
}
