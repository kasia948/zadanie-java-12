public class ShowNumbers {
    public static void main(String[] args) {
        int i=0;
        int sum=0;

        while (i<=100){
            if (i%2!=0){
                i=i+1;
                sum= sum+i;
                continue;
            }
            System.out.println(i);
            i=i+1;
        }
        System.out.println(sum);
    }
}