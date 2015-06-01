import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by shybovycha on 01.06.15.
 */
public class StringFactory {
    public enum StringSource { DISK, NETWORK};

    public static CharSequence getString(StringSource source, int length) {
        IStringStorage storage = null;

        if (source == StringSource.DISK) {
            storage = new DiskStorage();
        } else if (source == StringSource.NETWORK) {
            storage = new NetworkStorage();
        }

        return new MyString(storage, length);
    }
}
