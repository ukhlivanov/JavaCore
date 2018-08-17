package code30days.App14;


public class Difference {
    private int[] a;
    public int maximumDifference;

    public Difference(int[] a) {
        this.a = a;
    }
    public void computeDifference(){
        for (int i=0; i<a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (maximumDifference < Math.abs(a[i] - a[j])) {
                    maximumDifference = Math.abs(a[i] - a[j]);
                }
            }
        }
    }
}
