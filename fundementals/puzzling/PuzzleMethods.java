// You will need to import the Random library from java.util
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

// To use methods from the Random library you will need to create an instance of Random
// Random randMachine = new Random()
// From there you can use any of the methods listed in the documentation. For example:
// randMachine.setSeed(35679); //

public class PuzzleMethods{
    ArrayList<Integer> getTenRolls(){
    ArrayList<Integer> random10 = new ArrayList<Integer>();
    Random rand = new Random();

    for(int i = 1; i <= 10; i++){
        random10.add(rand.nextInt(20)+ 1);
    }
    return random10;

    // Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 
    }
    String getRandomLetter(){
        String[] letter = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Integer alphabet = 0;
        Random rolls = new Random();

        // System.out.println(rolls);
        for(int i = 0; i <= 1; i++){
        alphabet = (rolls.nextInt(26)+ 1);
        }
        String temp = letter[alphabet];
        return temp;

    }
    
    String generatePassword(){
        String[] letter = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Integer alphabet = 0;
        Random rolls = new Random();
        String chars = "";

        // System.out.println(rolls);
        for(int i = 0; i <= 7; i++){
        alphabet = (rolls.nextInt(25)+ 1);
        chars += letter[alphabet];
        }
        // String temp = letter[alphabet];
        
        return chars;
    // Generate a random index between 0-25, and use it to pull a random letter out of the array.
    }

    String getNewPasswordSet(int z){
        String[] letter = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Integer alphabet = 0;
        Random rolls = new Random();
        String chars = "";

        // System.out.println(rolls);
        for(int i = 0; i <= z - 1; i++){
        alphabet = (rolls.nextInt(25)+ 1);
        chars += letter[alphabet];
        }
        // String temp = letter[alphabet];
        
        return chars;

    // Write a method that takes an int length as an argument and creates an array of random eight character words. The array should be the length passed in as an int.
    }

}

