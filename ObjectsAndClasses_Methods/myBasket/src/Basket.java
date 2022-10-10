public class Basket {

    private static int count = 0;
    private String items = "";
    private static int totalPrice = 0;
    private int price=0;
    private int limit;
    private double weight;
    private static double totalWeight = 0;//
    private static int averagePrice;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice, double weight) {
        this();
        this.items = this.items + items;
        Basket.totalPrice = totalPrice;
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }


    public static void increaseCount(int count) {

        Basket.count = Basket.count + count;
    }
    public static void increaseTotalPrice(int price){
        Basket.totalPrice=totalPrice+price;
    }
    public static int getAveragePrice (){
        averagePrice=totalPrice/count;
        return averagePrice;

    }

    public void add(String name, int price, double weight) {

        add(name, price, weight, 1);
    }

    public void add(String name, int price, double weight, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " руб. - " + weight + " г.";
        totalWeight = totalWeight + count * weight;
        totalPrice = totalPrice + count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (!items.isEmpty()) {
            System.out.println(items);
        } else {
            System.out.println("Корзина пуста");
        }
    }
}