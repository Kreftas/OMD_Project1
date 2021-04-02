package operand;

import computer.Memory;

public class LongWord implements Word {

    private long value;
    public LongWord(long value) {
        this.value = value;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public Word add(Word w1) {
        if (w1 instanceof LongWord){
            this.value += ((LongWord) w1).value;
            return this;
        } else{
            throw  new IllegalArgumentException();
        }
    }

    @Override
    public Word mul(Word w1) {
        if (w1 instanceof LongWord){
            this.value *= ((LongWord) w1).value;
            return this;
        } else {
            throw  new IllegalArgumentException();
        }
    }

    @Override
    public Word getWord(Memory Context) {
        return this;
    }

    @Override
    public String toString(){
        return Long.toString(value);
    }

}
