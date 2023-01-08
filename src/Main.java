public class Main {
    public static void main(String[] args) {
        Soda cczero= new Soda("Coca-Cola Zero", 1.5, 20);
        Soda cc= new Soda("Coca-Cola", 1.5, 18);
        HairProduct sedalsh= new HairProduct("Shampoo Sedal", "500ml", 19);
        Fruit frutillas = new Fruit("Frutillas" , "kilo", 64);

        Product[] arr= new Product[] {cczero, cc, sedalsh, frutillas};

        showAllProductsInfo(arr);

    }
    public static void showAllProductsInfo(Product[] arr){
        try{
            for (Product prod : arr) {
                prod.showInfo();
            }
            System.out.println("=============================");

            prodHighValue(arr);
            prodLowValue(arr);
        }catch (NullPointerException e){
            System.out.println("Error: No hay productos en la lista");
        }
    }
    public static void prodHighValue(Product[] arr){
        Product res = arr[0];

        for ( Product prod : arr){
            if(prod.compareTo(res) != 1){
                res = prod;
            };
        }

        System.out.println("Producto mas caro: "+ res.getName());
    };
    public static void prodLowValue(Product[] arr){
        Product res = arr[0];
        for ( Product prod : arr){
            if(prod.compareTo(res) != -1){
                res = prod;
            };
        }

        System.out.println("Producto mas barato: "+ res.getName());
    };
}