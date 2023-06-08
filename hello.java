package hello;

public class Main
{
    public static void main(String[] args) {
        try {
            long time = System.currentTimeMillis() + 20 * 60 * 1000;
            while (System.currentTimeMillis() < time) {
                System.out.println("Hello world1");
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
