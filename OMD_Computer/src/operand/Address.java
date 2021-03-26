package operand;


public class Address extends Operand {

    public Address(int value) {
        super(value);

    }

    @Override
    public String toString() {
        return "[" + value + "]";
    }

}
