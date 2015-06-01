/**
 * Created by shybovycha on 01.06.15.
 */
public class MyString implements CharSequence {
    private String data;

    public MyString(String s) {
        this.data = s;
    }

    @Override
    public int length() {
        return this.data.length();
    }

    @Override
    public char charAt(int index) {
        return this.data.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new MyString(this.data.substring(start, end));
    }

    public void append(String s) {
        this.data += s;
    }
}
