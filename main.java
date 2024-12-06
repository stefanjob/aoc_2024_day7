import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class main {
    public static void part1() {
        System.out.println("AoC Day 7 Part 1");
       
       
        boolean full = true;
        Scanner scanner = null;
 
        try {
            if (full) {
                scanner = new Scanner(new File("input_full.txt"));
            } else {
                scanner = new Scanner(new File("input_test.txt"));
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getStackTrace());
        }
       
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            
        }
    }
 
    public static void part2()
    {
        System.out.println("AoC Day 7 Part 2");
       
        boolean full = false;
        Scanner scanner = null;
 
        try {
            if (full) {
                scanner = new Scanner(new File("input.txt"));
            } else {
                scanner = new Scanner(new File("input_test.txt"));
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
 
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
   public static void main(String[] args) {
    part1();
   }
}