public class Main {
    public static void main(String[] args) {
        double[] mylist = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        double maxNumber = mylist[0];
        for (double item : mylist) {
            total += item;
            System.out.println(item);

            if (maxNumber < item) {
                maxNumber = item;
            }
        }
        System.out.printf("\nmylist array'indeki sayıların toplamı: %f dir.\n", total);

        System.out.printf("\nEn büyük dizi elemanı %f dir.\n", maxNumber);

    }
}
