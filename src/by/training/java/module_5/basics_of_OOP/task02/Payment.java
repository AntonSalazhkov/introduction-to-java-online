package by.training.java.module_5.basics_of_OOP.task02;

public class Payment extends ShoppingCart {

    private int orderCost;            // стоимость заказа

    public Payment() {
    }

    public void calculateOrderCost() {
        this.orderCost = 0;
        if (super.getCart().size() > 0) {
            for (ShoppingCart list : super.getCart()) {
                this.orderCost += list.getQuantity() * list.getProductPrice();
            }
        } else {
            System.out.println("Отсутствует товар в корзине");
        }
    }

    public int getOrderCost() {
        return this.orderCost;
    }
}
