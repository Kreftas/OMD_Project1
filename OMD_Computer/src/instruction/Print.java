package instruction;

import computer.Memory;
import operand.Operand;

public class Print implements Instruction{
    private Operand op;

    public Print(Operand op) {
        this.op = op;

    }

    @Override
    public void execute(Memory memory) {
        System.out.println(op.getWord(memory).toString());
        memory.incrProgramCounter();
    }

    @Override
    public String toString() {
        return "PRT " + op.toString();
    }


}
