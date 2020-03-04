import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Textfile {
    public static void main(String args[]) throws IOException {

        // Right now, this only works if you put the external data file one level above the "src" folder. I guess the
        // top level of your project directory?


        int i;
        double d;
        boolean b;
        String str;

        String filename;
        System.out.println("Enter file name. Do NOT include the .txt file extension");
        System.out.println("For now, just enter \"test\"");
        // There's no special reason to omit the ".txt" extension. I just wanted to test how to concatenate strings

        Scanner user_input = new Scanner(System.in);

        filename = user_input.nextLine();
        filename = filename + ".txt";
        // Java version of strcat

        // This gets the actual file
        FileReader external_file;
        external_file = new FileReader(filename);


        Scanner file_input = new Scanner(external_file);
        file_input.useDelimiter(":|\n");
        // the argument means ":" and new line aka "\n" act as delimiters in the file
        // without these, spaces (and periods?) are the default delimiters
        //
        // So, in other words, I've written this to use files that separates data with colons and new lines



        while (file_input.hasNext()) {

            i = file_input.nextInt();
            System.out.println("int: " + i);
            d = file_input.nextDouble();
            System.out.println("double: " + d);
            b = file_input.nextBoolean();
            System.out.println("boolean: " + b);
            str = file_input.next();
            System.out.println("String: " + str);

            System.out.println(String.format("%d %.2f %b %s", i, d, b, str));
            // the .2 inbetween % and f will force display only 2 digits after decimal
        }
        external_file.close();
    }
}