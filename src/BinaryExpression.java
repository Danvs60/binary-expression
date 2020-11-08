/**
 * Binary expression class.
 *
 * @author Daniel
 * @version 1.0
 */
public class BinaryExpression<V extends Evaluable, N extends Evaluable> implements Evaluable{
    private Operator operator;
    private V x;
    private N y;

    public BinaryExpression(Operator op, V x, N y) {
        this.operator = op;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x.toString()
                + operator.toString()
                + y.toString() + ")";
    }

    @Override
    public int eval() {
        return operator.op.applyAsInt(x.eval(), y.eval());
    }
}
