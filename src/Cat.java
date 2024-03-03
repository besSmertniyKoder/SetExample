public class Cat {
     String name; // - Поле класса
    int age; // - Поле класса
    int weight; // - Поле класса
    public void voice(String name){
        this.name = name;
        System.out.println("meow " + name);
    }
    public static String printName(int age){
        System.out.println("age returning " + age);
        return "name";

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
