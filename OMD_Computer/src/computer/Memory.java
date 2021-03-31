package computer;

import operand.Word;

public abstract class Memory{

    protected Word [] memory;
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

    public abstract void populate(int size);
}
