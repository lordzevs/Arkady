import java.util.Scanner;

/* 
Треугольник
*/

public class Java {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    if (a<(b+c) && b<(a+c) && c<(b+a)) {
        System.out.println(TRIANGLE_EXISTS);
    }
    else {
        System.out.println(TRIANGLE_NOT_EXISTS);
    }


    s.close();//напишите тут ваш код
    }
    
}