public abstract class Product implements Comparable<Product>{
    private int value;
    private String name;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(int value, String name) {
        this.value = value;
        this.name = name;
    }


    public int compareTo(Product prod) {
        int res=0;

        if (this.value< prod.value) {
            res = 1;
        }
        else if (this.value> prod.value) {
            res = -1;
        }
        return res;
    }
    public void showInfo(){ System.out.println("Nombre: " + this.name + this.toString());}
}
