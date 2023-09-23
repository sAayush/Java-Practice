public class NonMinMaxSalary {
    public double average(int[] sal) {
        int max = 0;
        int min = 0;

        // find max and min
        for (int i = 0; i < sal.length; i++) {
            if (sal[i] >= sal[max]) {
                max = i;
            }
            if (sal[i] <= sal[min]) {
                min = i;
            }
        }
        System.out.println(max + " " + min);

        // find average
        double sum = 0;
        for (int i = 0; i < sal.length; i++) {
            if (i != max && i != min) {
                sum += sal[i];
            }
        }
        return sum / (sal.length - 2);
    }

    public static void main(String[] args) {
        NonMinMaxSalary n = new NonMinMaxSalary();

        int[] sal = { 4000, 3000, 1000, 2000 };
        System.out.println(n.average(sal));
    }
}
