package IntBinaryOperat;

public class Addition extends IntBinaryOperation {

    public Addition(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }
    @Override
    public int perform() {
        return fistArg + secondArg;
    }

    @Override
    public String toString() {
        return String.format("%d", fistArg + secondArg);
    }
}
