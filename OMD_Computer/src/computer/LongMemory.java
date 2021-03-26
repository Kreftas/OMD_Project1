package computer;


import operand.Address;
import operand.Operand;

public class LongMemory extends Memory {
    private long[] memory;

    public LongMemory(int size) {
        memory = new long[size];
    }

    public void setAtAddress(Address address, Operand operand) {
        memory[(int) address.getValue()] = operand.getValue();
    }


}
