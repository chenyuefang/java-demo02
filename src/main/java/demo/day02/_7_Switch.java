package demo.day02;

public class _7_Switch {
    public static void main(String[] args) {
        String grade = "A+";
        switch (grade) {
            case "A+":
                System.out.println("优秀");
                break;
            case "A":
                System.out.println("良好");
                break;
            case "B":
                System.out.println("中等");
                break;
            case "C":
                System.out.println("不及格");
                break;
            default:
                break;

        }
    }
}
