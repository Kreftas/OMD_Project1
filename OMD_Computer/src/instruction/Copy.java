package instruction;

import computer.Memory;
import operand.Address;
import operand.Operand;

public class Copy implements Instruction {
    private Operand op;
    private Address adress;

    public Copy(Operand op, Address adress) {
        this.adress = adress;
        this.op = op;

    }

    @Override
    public void execute(Memory memory) {

    }

    @Override
    public String toString() {
        return "CPY " + op.toString() + " " + adress.toString();
    }
}
