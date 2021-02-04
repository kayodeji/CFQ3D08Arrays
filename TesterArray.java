/** MyComplex Tester
 *   Written by Kymberly Ayodeji
 *   To test Q3D08 HomeFun
 **/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TesterArray
 {
     public static void main(String[] args) throws FileNotFoundException
     {


        // Set up to write to file.
        String outputFileName ="complexarraystestresults.csv";
        PrintWriter out = new PrintWriter(outputFileName);

        MyComplex c = new MyComplex(3,-4);
        out.println("Original Complex Number: " + c.toString());
        int[] s = {1,2,3,4};
        MyComplex[] results = c.scalarMultiples(s); //MyComplex numbers that can be
                                                    //represented as
                                                    //{ 3-4i, 6-8i, 9-12i, 12-16i }
        for (MyComplex myC : results)
        {
          out.println(myC.toString());
        }

        out.println(c.isMultiple(results));  // prints out True

        MyComplex c2 = new MyComplex(-1,5);
        out.println(c2.multipleOf(results));   // should print out -1

        int n = 4;
        MyComplex[] p = c2.powers(n);                  //MyComplex numbers that can be
                                                      // represented as
                                                      //{ -1,+5i, -24+10i, 74-110i}
        out.println(n + " Powers of " + c2.toString());
        for (MyComplex myC : p)
        {
          out.println(myC.toString());
        }
        out.close();
     }
 }
