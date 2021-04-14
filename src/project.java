
import java.io.*;
public class project {
    // PrintWriter object for file3.txt



    static void merge() throws IOException {
        PrintWriter printer = new PrintWriter("C:\\Users\\FAVOUR\\Desktop\\file3.txt");

        // BufferedReader object for file1.txt
        BufferedReader buffer = new BufferedReader(new FileReader("C:\\Users\\FAVOUR\\Desktop\\file1.txt"));

        String line = buffer.readLine();

        // loop to copy each line of
        // file1.txt to  file3.txt
        while (line != null) {
            printer.println(line);
            line = buffer.readLine();
        }
        buffer = new BufferedReader(new FileReader("C:\\Users\\FAVOUR\\Desktop\\file2.txt"));

        line = buffer.readLine();

        // loop to copy each line of
        // file2.txt to  file3.txt
        while (line != null) {
            printer.println(line);
            line = buffer.readLine();
        }

        printer.flush();

        // closing resources
        buffer.close();
        printer.close();

        System.out.println("Merged file1.txt and file2.txt into file3.txt");
    }
    static void count(){

    }


    public static void main(String[] args) throws IOException {

        merge();
        count();

    }

    {
    }}
