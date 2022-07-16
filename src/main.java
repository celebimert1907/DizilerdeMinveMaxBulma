import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int num = input.nextInt();

        int max = list[0];
        int min = list[0];

        Arrays.sort(list);

        for (int i : list) {
            if (i<num) {
                min=i;
            }
            if (i>num) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayiya en yakin kucuk sayi: " + min);
        System.out.println("Giriken sayiya en yakin buyuk sayi: " + max);
    }
}
