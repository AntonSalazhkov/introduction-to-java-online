package by.training.java.module_5.basics_of_OOP.task02;

public class Main {

    public static void main(String[] args) {
        // 2. Создать класс Payment с внутренним классом, с помощью обьектов которого
        // можно сформировать покупку из нескольких товаров.

        Payment payment = new Payment();

        // номер товара в корзине, наименование, количество, цена
        Payment.ShoppingCart product1 = payment.new ShoppingCart(1, "Телевизор", 1, 100);
        Payment.ShoppingCart product2 = payment.new ShoppingCart(2, "Утюг", 2, 200);


        payment.shoppingCart.addToCart(product1);                // добавляем товар в корзину
        payment.shoppingCart.addToCart(product2);
        payment.calculateOrderCost();                            // высчитываем стоимость заказа

        payment.shoppingCart.getString();                        // вывести товары в корзине
        System.out.println("К оплате: " + payment.getOrderCost() + " руб.");


        payment.shoppingCart.quantityChange(2, 3); // меняем количество товара (номер товара, новое количество)
        payment.calculateOrderCost();                            // пересчитываем стоимость заказа

        payment.shoppingCart.getString();
        System.out.println("К оплате: " + payment.getOrderCost() + " руб.");


        payment.shoppingCart.deleteProduct(1);           // удаляем заказ из корзины (номер товара)
        payment.calculateOrderCost();                            // пересчитываем стоимость заказа

        payment.shoppingCart.getString();
        System.out.println("К оплате: " + payment.getOrderCost() + " руб.");
    }
}
