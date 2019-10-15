package task1_5b;

public class Packaging {
    private String packing;
    private String nameShop;
    private String nameProduct;

    public Packaging(String nameProduct, String nameShop){
        this.nameProduct = nameProduct;
        this.nameShop = nameShop;

    }
    public Packaging(String packing){
        this.packing = packing;
    }

    public String getPackaging(){
        return packing;
    }
    public String getNameShop(){
        return nameShop;
    }
    public String getNameProduct(){
        return nameProduct;
    }

    public String toString() {
        return String.format("\tPacking: " + packing + "\n");
    }
}