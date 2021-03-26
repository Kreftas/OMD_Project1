package instruction;

public class Jump implements Instruction{
    private int dest;


    public Jump (int dest) {
        this.dest = dest;

    }

    @Override
    public void execute() {

    }

    @Override
    public String toString() {
        return "JMP " + dest;
    }

}
