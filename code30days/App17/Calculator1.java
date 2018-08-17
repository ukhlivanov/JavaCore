package code30days.App17;

public class Calculator1 {
    private int n;
    private  int p;

    public Calculator1() {
        this.n = n;
        this.p = p;
    }
    public int power(int a, int b) throws Exception {
            if (a>0 && b>0){
            return (int) Math.pow(a,b);
            }else {
            throw new Exception("n and p should be non-negative");
            }
        }
}
