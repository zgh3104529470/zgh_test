package tset_3;

public class GirlFriend {
    private String name;
    private int age;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName(String name) {
        return this.name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) throws RuntimeException{
        int len = name.length();
        if(len > 13 || len < 3){
            throw new RuntimeException();
        }
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge(int age) {
        return this.age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) throws RuntimeException,NumberFormatException{
        if(age > 20 || age < 18){
            throw new RuntimeException();
        }
        this.age = age;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + "}";
    }
}
