import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by shybovycha on 01.06.15.
 */
public class StringFactory {
    public enum StringSource { SRC_A, SRC_B };
    private Map<StringSource, CharSequence> data;

    public StringFactory() {
        String src_a_str = "";

        for (int i = 0; i < 2000; i++) {
            src_a_str += "a";
        }

        MyString src_b_str = new MyString("");

        for (int i = 0; i < 2000; i++) {
            src_b_str.append("a");
        }

        this.data = new HashMap<StringSource, CharSequence>();
        this.data.put(StringSource.SRC_A, src_a_str);
        this.data.put(StringSource.SRC_B, src_b_str);
    }

    public CharSequence getString(int length) {
        Random rnd = new Random();

        if (rnd.nextInt(1000) > 700) {
            return this.data.get(StringSource.SRC_A).subSequence(0, length);
        } else {
            return this.data.get(StringSource.SRC_B).subSequence(0, length);
        }
    }
}
