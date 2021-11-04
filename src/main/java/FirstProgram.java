public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Привет, мир!");
        long summa = calculate(7, 2, 4);
        System.out.println(summa);
    }
    public static long calculate(int arg1, int arg2, int arg3) {
        long result = (arg1 + arg2) - arg3;
        return result;
    }
}
