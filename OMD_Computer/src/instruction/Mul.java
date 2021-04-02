package instruction;

import operand.Address;
import operand.Operand;
import operand.Word;

public class Mul extends Expression {

    public Mul (Operand op1, Operand op2, Address adress) {
        super(op1, op2, adress, "MUL");
    }

    @Override
    protected Word op(Word o1, Word o2) {
        return o1.mul(o2);
    }
}
