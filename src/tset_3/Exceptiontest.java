package tset_3;

import java.util.Scanner;

public class Exceptiontest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GirlFriend gf = new GirlFriend();
        while (true) {
            try {
                System.out.println("请输入姓名");
                String name = sc.nextLine();
                gf.setName(name);
                System.out.println("请输入年龄");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄格式有误");
            } catch (RuntimeException e){
                System.out.println("姓名格式有误或长度有误");
            }
        }
        System.out.println(gf);
    }
}
