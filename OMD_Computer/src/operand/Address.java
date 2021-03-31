package operand;


import computer.Memory;

public class Address implements Operand {

    private int adress;
    public Address(int memIndex) {
        this.adress = memIndex;
    }

    public Word getWord(Memory context){
        return context.get(adress);
    }

    @Override
    public String toString() {
        return "[" + adress + "]";
    }

}
