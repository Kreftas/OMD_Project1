package instruction;

import computer.Memory;

public class Halt implements Instruction{

    public Halt() {

    }

    @Override
    public void execute(Memory memory) {

    }

    @Override
    public String toString() {
        return "HLT ";
    }



}
