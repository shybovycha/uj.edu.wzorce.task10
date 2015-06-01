import java.util.Random;

/**
 * Created by shybovycha on 01.06.15.
 */
public class Main {
    public static void main(String args[]) {
        Random rnd = new Random();
        CharSequence s1 = StringFactory.getString(StringFactory.StringSource.DISK, 1);
        CharSequence s2 = StringFactory.getString(StringFactory.StringSource.NETWORK, 1);

        for (int i = 0; i < 20; i++) {
            int len = rnd.nextInt(50);

            if (rnd.nextInt(1000) > 400) {
                System.out.printf(">> DISK: %s\n\n", s1.subSequence(0, len));
            } else {
                System.out.printf(">> NETWORK: %s\n\n", s2.subSequence(0, len));
            }
        }
    }
}
