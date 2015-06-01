/**
 * Created by shybovycha on 01.06.15.
 */
public class NetworkStorage implements IStringStorage {
    @Override
    public CharSequence getStringData(int length) {
        StringBuffer sb = new StringBuffer();
        final String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < length; i++) {
            sb.append(alphabet.charAt(i % alphabet.length()));
        }

        return sb;
    }
}
