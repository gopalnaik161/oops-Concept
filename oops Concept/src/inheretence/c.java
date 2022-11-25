package inheretence;

public class c extends B {
    public void test3(){
        System.out.println(300);
    }

    public static void main(String[] args) {
        c c1 =  new c();
         c1.test1();
         c1.test2();
         c1.test3();
    }

}
