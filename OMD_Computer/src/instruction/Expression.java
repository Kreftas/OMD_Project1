package instruction;

import computer.Memory;
import operand.Address;
import operand.Operand;
import operand.Word;

public abstract class Expression implements Instruction{

    private Operand op1, op2;
    protected Address adress;
    private String opName;


    public Expression(Operand op1, Operand op2, Address address, String opName) {
        this.adress = adress;
        this.op1 = op1;
        this.op2 = op2;
    }

    protected abstract Word op(Word w1, Word w2);

    @Override
    public void execute(Memory memory) {
        Word value = op(op1.getWord(memory), op2.getWord(memory));
        adress.getWord(memory).setValue(value);
        // ÖKA PC + 1
    }

    @Override
    public String toString() {
        return opName + op1.toString() + " "+  op2.toString() + " " + adress.toString();
    }

}
