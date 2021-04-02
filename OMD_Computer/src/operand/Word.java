package operand;

public interface Word <V> extends Operand {
    public void setValue(Word w1);
    public V getValue();
    public Word add(Word w1);
    public Word mul(Word w1);
}
