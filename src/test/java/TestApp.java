public class TestApp {

    public static void main(String[] args) {


        String name = Thread.currentThread().getName();
        System.out.println(name);

        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        }).start();


    }

}
