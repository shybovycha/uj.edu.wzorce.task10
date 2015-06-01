import java.util.Random;

/**
 * Created by shybovycha on 01.06.15.
 */
public class Main {
    public static void main(String args[]) {
        StringFactory factory = new StringFactory();

        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            rnd.nextInt(2000);
            CharSequence s = factory.getString(10);
            System.out.printf(">> %s (%d)\n", s.getClass().getName(), s.length());
        }
    }
}
