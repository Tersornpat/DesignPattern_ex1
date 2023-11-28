import java.util.Scanner;

public class Foot {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        FootShape footShape = new FootShape();
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int type = inp.nextInt();
        String foot = new String();
        switch(type) {
            case 1:
                foot = footShape.drawAsEllipse();
                break;
            case 2:
                foot = footShape.drawAsRectangle();
                break;
        }
        System.out.println(foot);
    }
}
