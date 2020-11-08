public class INTEGER implements Evaluable {
    private int value;

    public INTEGER(int value){
        this.value = value;
    }

    @Override
    public int eval() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
