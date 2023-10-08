package tset_5;

import java.io.FileInputStream;
import java.io.IOException;

public class IODemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\aaa\\ccc\\test.txt");
       /* int read = fis.read();
        System.out.println(read);*/
        //read每次只读一个
        int b;
        while((b = fis.read()) != -1){
            System.out.print((char)b);
        }
        fis.close();
    }
}
