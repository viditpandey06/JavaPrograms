public class Hello {
    int age;
    int sal;

    Hello(int age) {
        System.out.println("This is a constructor");
        this.age = age;
        this.sal = 0;
    }

    Hello() {
        age = 0;
        sal = 0;
    }

    Hello(int age, int sal) {
        this.age = age;
        this.sal = sal;
    }

    public static void main(String[] args) {
        Hello obj1 = new Hello();
        Hello obj2 = new Hello(40);
        Hello obj3 = new Hello(40, 500);
        System.out.println("obj1.age");
    }

}