package computer;

import instruction.Instruction;

public class Computer {
    private Program program;

    private Memory memory;

    public Computer(Memory memory) {
        this.memory = memory;
    }

    public void load(Program program) {
        this.program = program;
    }

    public void run(){
        memory.setProgramCounter(0);
        while(memory.getProgramCounter() != -1) {
            program.get(memory.getProgramCounter()).execute(memory);
        }
    }

}
