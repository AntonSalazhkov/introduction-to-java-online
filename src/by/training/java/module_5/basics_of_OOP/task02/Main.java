package by.training.java.module_5.basics_of_OOP.task02;

public class Main {

    public static void main(String[] args) {
        // 2. Создать класс Payment с внутренним классом, с помощью обьектов которого
        // можно сформировать покупку из нескольких товаров.

        Payment payment = new Payment();

        // номер товара в корзине, наименование, количество, цена
        ShoppingCart product1 = new ShoppingCart(1, "Телевизор", 1, 100);
        ShoppingCart product2 = new ShoppingCart(2, "Утюг", 2, 200);

        payment.addToCart(product1);                // добавляем товар в корзину
        payment.addToCart(product2);
        payment.calculateOrderCost();               // высчитываем стоимость заказа

        payment.getString();                        // вывести товары в корзине
        System.out.println("К оплате: " + payment.getOrderCost() + " руб.");


        payment.quantityChange(2, 3);     // меняем количество товара (номер товара, новое количество)
        payment.calculateOrderCost();                      // пересчитывеме стоимость заказа

        payment.getString();
        System.out.println("К оплате: " + payment.getOrderCost() + " руб.");


        payment.deleteProduct(1);                  // удаляем заказ из корзины (номер товара)
        payment.calculateOrderCost();                      // пересчитывеме стоимость заказа

        payment.getString();
        System.out.println("К оплате: " + payment.getOrderCost() + " руб.");
    }
}
