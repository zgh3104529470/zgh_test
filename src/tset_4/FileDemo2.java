package tset_4;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo2 {
    public static void main(String[] args) {
        File f1 = new File("F:\\python学习\\Java基础-资料\\day01-Java入门\\笔记\\day01-Java基础语法.md");
        long len = f1.length();
        System.out.println(len);

        File f2 = new File("F:\\python学习\\Java基础-资料\\day01-Java入门\\笔记\\day01-Java基础语法.md");
        String path1 = f2.getAbsolutePath();

        File f3 = new File("F:\\python学习\\Java基础-资料\\day01-Java入门\\笔记\\day01-Java基础语法.md");
        long time = f3.lastModified();
        System.out.println(time);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf1.format(time));
    }
}
