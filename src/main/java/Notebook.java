public class Notebook {
    int weight;
    int price;

    int yearOfProduction;
    String color;



    public Notebook(int weight, int price,int yearOfProduction,String color) {
        this.weight = weight;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        }else if (this.price >= 600 && this.price <1000) {
            System.out.println("This price is good.");
        }else {
            System.out.println("This notebook is quite expensive.");
        }
    }
    public void checkWeight() {
        if(this.weight < 1000){
            System.out.println("This weight is light.");
        }else if (this.weight >= 1000 && this.weight <1700) {
            System.out.println("This weight is not too heavy.");
        }else {
            System.out.println("This weight is heavy.");
        }
    }
    public void checkYear() {
        if(this.yearOfProduction < 2000) {
            System.out.println("Not buy is too old");
        }else if (this.yearOfProduction < 2000 && this.price > 4000) {
            System.out.println("Buy it!");
        }else {
            System.out.println("Wait to the better offer");
        }
    }
}
