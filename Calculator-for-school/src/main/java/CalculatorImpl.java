/**
 * Created by DarthVader on 03.09.2016.
 */
public class CalculatorImpl implements Calculator {
    MatchParser p = new MatchParser();
    DoubleRoundTest d = new DoubleRoundTest();

    public static void main(String[] args) {
        Calculator a = new CalculatorImpl();
        System.out.println(a.evaluate("(2+9)/3"));
    }

    public String evaluate(String statement) {
        try {
            return String.valueOf(statement + "=" + d.doubleRound(p.parse(statement)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
