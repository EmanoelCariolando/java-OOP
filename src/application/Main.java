package application;

import entities.enums.OrderStatus;
import mainEntities.Order;

import java.util.Date;

public class Main {
        public static void main(String[] args) {

                Order order = new Order(10, new Date(), OrderStatus.PENDING);
                System.out.println(order);

                OrderStatus x1 = OrderStatus.PENDING;
                OrderStatus x2 = OrderStatus.valueOf("PENDING");
                
                System.out.println(x1 == x2);
                System.out.println(x1);
                System.out.println(x2);

        }
}





