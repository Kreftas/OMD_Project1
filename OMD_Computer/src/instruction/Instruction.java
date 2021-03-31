package instruction;

import computer.Memory;

public interface Instruction {

    public void execute(Memory memory);

    public String toString();

}
