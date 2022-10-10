import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket() ;
            Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Эмулятор корзины\n-- Добавление нового товара");
            System.out.println("Введите название нового товара:  ");
            String name = scanner.nextLine();
            System.out.println("Введите цену товара: ");
            int price = scanner.nextInt();
            System.out.println("Введите вес товара: ");
            double weight = scanner.nextDouble();
            basket.add(name, price,weight);
            basket.print("Корзина");
            basket.clear();
        }



    }

}
