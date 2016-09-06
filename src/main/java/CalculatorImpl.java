/**
 * Created by DarthVader on 03.09.2016.
 */
public class CalculatorImpl implements Calculator {
    public static void main(String[] args) {
        String formulas = new String("(2+2)*2");
        MatchParser p = new MatchParser();
        try {
            System.out.println(p.parse("(2+2)*2"));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public String evaluate(String statement) {
        MatchParser p = new MatchParser();
        try {
            return String.valueOf(p.parse(statement));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}