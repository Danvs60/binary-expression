import java.util.function.IntBinaryOperator;

/**
 * Operator enum class.
 *
 * @author Daniel
 * @version 1.0
 */
public enum Operator {
    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y);

    String name;
    IntBinaryOperator op;

    Operator(String name, IntBinaryOperator op) {
        this.name = name;
        this.op = op;
    }

    public String toString() {
        return name;
    }
}
