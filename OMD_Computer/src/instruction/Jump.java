package instruction;

import computer.Memory;

public class Jump implements Instruction{
    private int dest;


    public Jump (int dest) {
        this.dest = dest;

    }

    @Override
    public void execute(Memory memory) {
        memory.setProgramCounter(dest);
    }

    @Override
    public String toString() {
        return "JMP " + dest;
    }

}
