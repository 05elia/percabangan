import java.util.Scanner;
public class discount {
    public static void main(String[] args) throws Exception {
        Double totalbelanja, discount;

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan total belanja; ");
        totalbelanja = inputan.nextDouble();

        if (totalbelanja >= 100000) {
            discount = 5/100 * totalbelanja;
            totalbelanja = totalbelanja - discount;
        }

        System.out.print("Total yang harus dibayar: " + totalbelanja);

        inputan.close();
    }
}
