import java.util.Scanner;

/**
 * Variable class.
 *
 * @author Daniel
 * @version 1.0
 */
public class Variable implements Evaluable{
    private String name;
    private int value;

    public Variable(String name){
        this.name = name;
        value = Integer.MAX_VALUE;
    }

    @Override
    public String toString() {
        return name;
    }


    @Override
    public int eval() {
        if(value == Integer.MAX_VALUE) {
            Scanner s = new Scanner(System.in);
            System.out.print("Input the value of your variable " + name + ":");
            value = s.nextInt();
            s.close();
        }
        return value;
    }
}
