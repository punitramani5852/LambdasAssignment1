package Lambda_assignment;

public class Main {
    public static void main(String[] args) {
        int firstnumber=89;
        int secandnumber=96;
        MaximumBetweenTwo obj=new MaximumBetweenTwoImpl();
        int result=obj.getMaximumNumber(firstnumber,secandnumber);
        System.out.println(result);


    }
}
