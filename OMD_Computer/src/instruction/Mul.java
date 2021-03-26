package instruction;

import operand.Address;
import operand.Operand;

public class Mul implements Instruction {
    private Operand op1, op2;
    private Address adress;

    public Mul (Operand op1, Operand op2, Address adress) {
        this.adress = adress;
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public void execute() {

    }

    @Override
    public String toString() {
        return "MUL " + op1.toString() + " "+  op2.toString() + " " + adress.toString();
    }
}
