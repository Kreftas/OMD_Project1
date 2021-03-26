package computer;

import instruction.Instruction;

public class Computer {
    private Program program;
    private int programCounter;
    private Memory memory;

    public Computer(Memory memory) {
        this.memory = memory;

    }


    public void load(Program program) {
        this.program = program;
    }


    public void run(){
        programCounter = 0;
        while(programCounter != -1) {
            program.get(programCounter).execute();



        }

    }


}
