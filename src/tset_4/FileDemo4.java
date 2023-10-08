package tset_4;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        File f1 = new File("F:\\aaa\\ccc\\test.txt");
        boolean b = f1.delete();
        System.out.println(b);
    }
}
