/**
 * Created by DarthVader on 03.09.2016.
 */
public class CalculatorImpl implements Calculator {
    static String formula = new String("(2+9)/3");
    MatchParser p = new MatchParser();
    DoubleRoundTest d = new DoubleRoundTest();

    public static void main(String[] args) {
        Calculator a = new CalculatorImpl();
        System.out.println(a.evaluate(formula));
    }

    public String evaluate(String statement) {
        try {
            return String.valueOf(formula + "=" + d.doubleRound(p.parse(statement)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
