package tset_4;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File f1 = new File("F:\\python学习\\Java基础-资料\\day01-Java入门\\笔记");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        System.out.println(f1.isAbsolute());
    }
}
