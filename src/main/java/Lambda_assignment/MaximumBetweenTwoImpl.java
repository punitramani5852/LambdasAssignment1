package Lambda_assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumBetweenTwoImpl implements MaximumBetweenTwo {
    @Override
    public int getMaximumNumber(int number1, int number2) {
        List<Integer> numberlist= Arrays.asList(number1,number2);
        Optional<Integer> max= numberlist.stream().max((x, y) ->
        {
            int MaxNum=Integer.compare(x, y);
            return MaxNum;
        } );
        System.out.println(max.get());
        return max.get();


    }
}
