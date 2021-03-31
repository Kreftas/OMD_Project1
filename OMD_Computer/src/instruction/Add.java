package instruction;

import operand.Address;
import operand.Operand;
import operand.Word;

public class Add extends Expression {

    public Add (Operand op1, Operand op2, Address adress) {
        super(op1, op2, adress, "ADD");

    }

    @Override
    protected Word op(Operand op1, Operand op2) {
        return null;
    }

}
