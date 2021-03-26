package operand;

import operand.Operand;

public class Word extends Operand {

    public Word(int value) {
        super(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
