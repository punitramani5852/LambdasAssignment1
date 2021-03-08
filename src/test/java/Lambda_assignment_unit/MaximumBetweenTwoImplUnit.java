package Lambda_assignment_unit;

import Lambda_assignment.MaximumBetweenTwoImpl;
import org.junit.Assert;
import org.junit.Test;




public class MaximumBetweenTwoImplUnit {
    @Test

    public void getMaximumBetweenTwoTest()
    {
        MaximumBetweenTwoImpl obj=new MaximumBetweenTwoImpl();
        int test1=obj.getMaximumNumber(100,89);
        Assert.assertEquals(100,test1);


        MaximumBetweenTwoImpl obj1=new MaximumBetweenTwoImpl();
        int test2=obj.getMaximumNumber(0,0);
        Assert.assertEquals(0,test2);


        MaximumBetweenTwoImpl obj2=new MaximumBetweenTwoImpl();
        int test3=obj.getMaximumNumber(1000000,1235);
        Assert.assertEquals(1000000,test3);






    }

}
