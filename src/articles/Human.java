package articles;

public class Human {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }
    public String getName() {
        return name;

    }

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("lizzy");
        human.setAge(15);
        String name = human.getName();
        int age = human.getAge();
        System.out.println("My name is " + name );
        System.out.println("I am " + age + " years old");
    }
}
