package instruction;

import operand.Operand;

public class Print implements Instruction{
    private Operand op;

    public Print(Operand op) {
        this.op = op;

    }

    @Override
    public void execute() {

    }

    @Override
    public String toString() {
        return "PRT " + op.toString();
    }


}
