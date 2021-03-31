package operand;


public class Address extends Operand {

    private int adress;

    public Address(int memIndex) {
        super(memIndex);

    }



    @Override
    public String toString() {
        return "[" + value + "]";
    }

}
