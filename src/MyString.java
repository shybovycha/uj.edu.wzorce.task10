/**
 * Created by shybovycha on 01.06.15.
 */
public class MyString implements CharSequence {
    private int length;
    private IStringStorage source;
    private CharSequence data;

    public MyString(IStringStorage storage) {
        this.length = 0;
        this.source = storage;
        this.data = null;
    }

    public MyString(IStringStorage storage, int length) {
        this.source = storage;
        this.load(length);
    }

    @Override
    public int length() {
        return this.length;
    }

    @Override
    public char charAt(int index) {
        if (index > this.length || this.data == null) {
            this.load(index + 1);
        }

        return this.data.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start >= this.length || end >= this.length) {
            this.load(end + 1);
        }

        return this.data.subSequence(start, end);
    }

    private void load(int length) {
        int delta = length - this.length;

        this.length = length;
        this.data = this.source.getStringData(length);

        System.out.printf("Loaded %d symbols\n", delta);
    }
}
