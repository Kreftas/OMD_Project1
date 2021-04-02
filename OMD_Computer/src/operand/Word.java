package operand;

public interface Word <V> extends Operand {
    public V getValue();
    public Word add(Word w1);
    public Word mul(Word w1);
}
