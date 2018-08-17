package code30days.App19;


public class Calculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
               count = count + i;
            }
        }

        return count;
    }
}
