public class User {
    String name;
    short  age;
    int height;
    public User(short age, short height, String name){
        this.age = age;
        this.height = height;
        this.name = name;
    }
    public User(String name, short age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(int height, String name, short age){
        this.height = height;
        this.name = name;
        this.age = age;
    }
    public User(int height, short age, String name){
        this.height = height;
        this.age = age;
        this.name = name;
    }
    public User(short age, String name, int height){
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public static void main(String[] args) {
        User masha = new User("Маша", (short) 27, 165);
        User dasha = new User("Даша", (short) 178, 209);
        User kolya = new User((short) 190, "Николай", 25);
        System.out.println(masha.age);
        System.out.println(dasha.height);
        System.out.println(kolya.name);
    }
}
