package operand;

public class LongWord implements Word {

    private long value;
    public LongWord(long value) {
        this.value = value;
    }

    @Override
    public void setValue(Word w1) {
        if (w1 instanceof LongWord){
            this.value = (long) w1.getValue();
        }
    }

    @Override
    public Object getValue() {
        return value;
    }
}
