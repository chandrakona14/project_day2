public class function {
    public static void main(String[]args){
        int sum= sumofnumbers(5);
        System.out.println("Sum Of Natural NUmbers: "+sum);

    }
    public static int sumofnumbers (int n) {
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum+=1;
        }
        return sum;
    }
}
