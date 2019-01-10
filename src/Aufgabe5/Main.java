package Aufgabe5;

import java.io.FileInputStream;
import java.io.FileReader;

public class Main
{

    public static void main(String[] args){

        /*
            Checked Exception:
            Treten schon während der Kompilierung auf, d.h. es wird schon vorher rot markiert
            z.B. FileNotFoundException (erben von Exception)
        */

        FileReader file = new FileReader("C:\\test.txt");

        /*
            Unchecked Exception:
            Treten während der Laufzeit und nicht während der Kompilierung auf
            z.B. ArrayIndexOutOfBoundsException (erben von RuntimeException)
        */

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(arr[7]);

    }

}
