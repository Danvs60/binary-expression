abstract public class AbstractFigure {
    private BiIntPredicate pred;
    private final int BOUND = 7;

    public AbstractFigure() {
        pred = ((x, y) -> false);
    }

    public BiIntPredicate getPred() {
        return pred;
    }

    public void setPred(BiIntPredicate pred) {
        this.pred = pred;
    }

    public static BiIntPredicate negate(BiIntPredicate p) {
        return (x, y) -> !(p.test(x, y));
    }

    public void invert() {
        pred = negate(pred);
    }

    public String toString() {
        String output = "";
        for (int i = 1; i <= BOUND; i++) {
            for (int j = 1; j <= BOUND; j++) {
                if (pred.test(i, j)) output += " *";
                else output += "  ";
            }
            output += "\n";
        }
        return output;
    }

    abstract void printFigure();
}
