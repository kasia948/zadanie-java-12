public class ShowNumbers {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (i <= 100) {
            if (i % 2 == 0) {
                sum = sum + i;
                System.out.println(i);
                i++;
                continue;
            }
            i++;
        }
        System.out.println(sum);
    }
}