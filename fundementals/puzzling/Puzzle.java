import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Puzzle{
    public static void main(String[]args){
    PuzzleMethods randorolls = new PuzzleMethods();
    ArrayList<Integer> rickrol = randorolls.getTenRolls();
    System.out.println(rickrol);
    
    System.out.println(randorolls.getRandomLetter());

    System.out.println(randorolls.generatePassword());

    System.out.println(randorolls.getNewPasswordSet(10));
    }
}