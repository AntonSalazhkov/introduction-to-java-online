package by.training.java.module_5.basics_of_OOP.task02;

import java.util.ArrayList;

public class Payment {

    ShoppingCart shoppingCart = new ShoppingCart();
    private int orderCost;            // стоимость заказа

    public Payment() {
    }

    public void calculateOrderCost() {
        orderCost = 0;
        if (shoppingCart.getCart().size() > 0) {
            for (ShoppingCart list : shoppingCart.getCart()) {
                this.orderCost += list.getQuantity() * list.getProductPrice();
            }
        } else {
            System.out.println("Отсутствует товар в корзине");
        }
    }

    public int getOrderCost() {
        return orderCost;
    }


    class ShoppingCart {

        private int number;                    // номер товара в корзине
        private String productName;            // название товара
        private int quantity;                  // количество
        private int productPrice;              // цена товара
        private ArrayList<ShoppingCart> cart;  // корзина

        public ShoppingCart() {
            this.cart = new ArrayList<>();
        }

        public ShoppingCart(int number, String name, int quantity, int price) {
            this.number = number;
            this.productName = name;
            this.quantity = quantity;
            this.productPrice = price;
        }

        public void addToCart(ShoppingCart product) {
            cart.add(product);
        }

        public String getProductName() {
            return productName;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getProductPrice() {
            return productPrice;
        }

        public ArrayList<ShoppingCart> getCart() {
            return cart;
        }

        public void getString() {
            for (ShoppingCart list : getCart()) {
                System.out.println("Товар в корзине: Наименование = " + list.getProductName() + ", количество = "
                        + list.getQuantity() + ", стоимость = " + list.getProductPrice() + "]");
            }
        }

        public void quantityChange(int number, int quantity) {
            try {
                getCart().get(number - 1).setQuantity(quantity);        // меняем количество товара ( -1, т.к. элементы коллекции нумеруются с 0)
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Товара под таким номером нет в корзине");
            }
        }

        public void deleteProduct(int number) {
            try {
                getCart().remove(number - 1);                    // удаляем заказ из корзины ( -1, т.к. элементы коллекции нумеруются с 0)
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Товара под таким номером нет в корзине");
            }
        }
    }
}
