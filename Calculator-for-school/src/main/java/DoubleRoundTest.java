import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by DarthVader on 07.09.2016.
 */
public class DoubleRoundTest {
    double templateDouble =0;
    public Double doubleRound(Double i){
        templateDouble =i;
        double newDouble = new BigDecimal(templateDouble).setScale(4, RoundingMode.HALF_UP).doubleValue();
        return newDouble;
    }


}
