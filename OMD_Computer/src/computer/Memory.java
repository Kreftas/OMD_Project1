package computer;

import operand.Word;

public abstract class Memory{

    protected Word [] memory;
    private int programCounter;
    public Memory(int size){
        memory = new Word[size];
    }

    public Word get(int address){
        if (address > memory.length || address < 0){
            return null;
        } else{
            return memory[address];
        }
    }

    public int getProgramCounter() {
        return programCounter;
    }

    public void setProgramCounter(int programCounter) {
        this.programCounter = programCounter;
    }

    public void incrProgramCounter(){
        programCounter++;
    }

    public abstract void populate(int size);
}
