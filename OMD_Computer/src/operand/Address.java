package operand;


import computer.Memory;

public class Address extends Operand {

    private int adress;
    public Address(int memIndex) {
        super(memIndex);
        this.adress = memIndex;
    }

    public Word getWord(Memory context){
        return context.get(adress);
    }

    @Override
    public String toString() {
        return "[" + value + "]";
    }

}
