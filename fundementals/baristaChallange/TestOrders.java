import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item("drip mocha",3.25 );
        
        Item item2 = new Item("latte", 4.5);

        Item item3 = new Item("drip coffee",2.15);

        Item item4 = new Item("capuccino", 3.5);
        
         // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.setName("Cindhuri");

        Order order2 = new Order();
        order2.setName("Jimmy");

        Order order3 = new Order("Noah"); 
        Order order4 = new Order("Sam");
        
        // Application Simulations
        order1.ready = true;

        order2.items.add(item1);
        // order2.total += item1.price;

        // Add item1 to order2's item list and increment the order's total.

        // order3.items.add(item4);
        // order3.total += item4.price;

        // order3 ordered a cappucino. Add the cappuccino to their order list and to their tab.

        // order4.items.add(item2);
        // order4.total += item2.price;

        // order4 added a latte. Update accordingly.

        // order4.items.add(item2);
        // order4.items.add(item2);
        // order4.total += item2.price * 2;

        // order2.ready = true;

        // for(int i = 0; i < order2.items.size(); i++){
        //     System.out.println(order2.items.get(i).name + ", "+ order2.items.get(i).price);
        // }

        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);

        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);

        // System.out.printf("Name: %s\n", order3.name);
        // System.out.printf("Total: %s\n", order3.total);
        // System.out.printf("Ready: %s\n", order3.ready);

        // System.out.printf("Name: %s\n", order4.name);
        // System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Ready: %s\n", order4.ready);
    }
}