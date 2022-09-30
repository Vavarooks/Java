import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items = new ArrayList<Item>(); // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    
    public Order(){
        this.name = "Guest";
    }

    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.

    public Order(String name){
        this.name = name;
    }
    
    // ORDER METHODS
    
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    
    // GETTERS & SETTERS

    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    public void addItem(Item items){
        this.items.add(item);
    }

    public String getStats(String){

    }

    public void changeReady(){
        if(this.ready){
            ready = false;
        }
        else{
            ready = true;
        }
    }
    
}

