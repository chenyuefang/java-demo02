package demo.day02;

public class _10_Prime {
    public static void main(String[] args) {

        for (int a = 101; a<= 200; a++) {
            if (a % 2!=0 && a % 3 != 0 && a% 5 != 0 && a % 7 != 0)
                System.out.println(a);
            else
                break;
        }
    }
}



