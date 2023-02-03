package IntBinaryOperat;

abstract class IntBinaryOperation {
    protected int fistArg;
    protected int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.fistArg = firstArg;
        this.secondArg = secondArg;
    }
    public abstract int perform();

}
