//Michael Murphy
//introclass2
public class introClass2 {
    public static void main(String[] args) {
        int var1 = 4;
        double var2 = 16.0;
        System.out.println(Math.sqrt(var1));
        System.out.println(Math.sqrt(var2));
        int square = (int) Math.pow(var1, 2);
        double square2 = (double) Math.pow(var2, 2);
        System.out.println(square);
        System.out.println(square2);
        double absolute = Math.abs(var1-var2);
        System.out.println(absolute);
        int min = 10;
        int max = 35;
        System.out.println((int)((Math.random() * ((max - min) + 1)) + min));
        int maximum = Math.max(min,max);
        int minimum = Math.min(min,max);
        int roundnum = (int) Math.round(var2);
        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(roundnum);

    }
}