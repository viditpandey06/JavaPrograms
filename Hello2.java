public class Hello2 {
    int age;
    int sal;

    Hello2(int age) {
        System.out.println("This is a constructor");
        this.age = age;
        this.sal = 0;
    }

    Hello2() {
        age = 0;
        sal = 0;
    }

    Hello2(int age, long sal) {
        this.age = age;
        this.sal = sal;
    }

    Hello2(long age, int sal) {
        this.age = age;
        this.sal = sal;
    }

    public static void main(String[] args) {
        Hello2 obj1 = new Hello2();
        Hello2 obj2 = new Hello2(40);
        Hello2 obj3 = new Hello2(40, 500);
        System.out.println("obj1.age");
    }

}