import java.io.FileInputStream;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {

    }

    //solves Case #1
    public static void case1() {

    }

    //solves Case #2
    public static void case2() {

    }

    //solves Case #3
    public static void case3() {

    }

    //converts a line of text into an array of Strings
    private static String[] findWords(String text) {
        return text.split("(\b| |,|\\. )");
    }

    //determines whether a String contains only numeric digits
    private static boolean isNumeric(String text)
    {
        try {
            Double.parseDouble(text);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}