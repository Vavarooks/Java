// import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;


public class CafeUtil{
    int getStreakGoal(){
        int sum = 0;
        for( int i =0; i < 11; i++){
            sum = sum + i;
        }
        return sum;
    }  
    double getOrderTotal(double[] prices){
    double result = 0.0;
    for(int i =0; i < prices.length; i++){
        result = result + prices[i];
    } 
    return result;
    }
    void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }
    
    void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        customers.add(userName);
        System.out.println("Hello "+ userName + " !" + " There are "+ customers.size()+" people ahead of you.");
        System.out.println(customers);
    }
}
