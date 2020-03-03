import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Textfile {
    public static void main(String args[]) throws IOException {

        int i;
        double d;
        boolean b;
        String str;

        //FileWriter fout = new FileWriter("test.txt");
        //fout.write("Testing Scanner 10 12.2 one true two false");
        //fout.close();
        String filename;
        System.out.println("Enter file name. Do NOT include the .txt file extension");
        System.out.println("For now, just enter \"test\"");
        Scanner user_in = new Scanner(System.in);
        filename = user_in.nextLine();
        filename = filename + ".txt";

        FileReader fin;
        //fin = new FileReader("test.txt");
        fin = new FileReader(filename);


        Scanner src = new Scanner(fin);
        src.useDelimiter(":|\n");
        // the argument means ":" and newline aka "\\n" act as delimiters in the file
        // without these, spaces are the default delimiter
        // also periods?


        /*
        while (src.hasNext()) {
            if (src.hasNextInt()) {
                i = src.nextInt();
                System.out.println("int: " + i);
            }

            else if (src.hasNextDouble()) {
                d = src.nextDouble();
                System.out.println("double: " + d);
            }
            else if (src.hasNextBoolean()) {
                b = src.nextBoolean();
                System.out.println("boolean: " + b);
            }
            else {
                str = src.next();
                System.out.println("String: " + str);
            }

         */
        while (src.hasNext()) {

            i = src.nextInt();
            System.out.println("int: " + i);
            d = src.nextDouble();
            System.out.println("double: " + d);
            b = src.nextBoolean();
            System.out.println("boolean: " + b);
            str = src.next();
            System.out.println("String: " + str);

            System.out.println(String.format("%d %.2f %b %s", i, d, b, str));
            // the .2 inbetween % and f will force display only 2 digits after decimal
        }
        fin.close();
    }
}