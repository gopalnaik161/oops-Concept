package encapsulation;

public class B {

    public static void main(String[] args) {
        A a1= new A();

        a1.setName("gopal");
        a1.setAge(22);

        System.out.println(a1.getName());
        System.out.println(a1.getAge());

    }
}
