package task1_5b;

public class Sweets {
    private String sweet;
    private int num;
    private String nameShop;

    public Sweets(String nameShop){
        this.nameShop = nameShop;
    }

    public Sweets(String sweet, int num){
        this.sweet = sweet;
        this.num = num;
    }

    public String getSweet(){
        return sweet;
    }
    public int getNum(){
        return num;
    }
    public String getNameShop(){
        return nameShop;
    }

    public String toString() {
        return String.format("\tSweets: " + sweet + ",  quantity: " + num +"\n");
    }
}