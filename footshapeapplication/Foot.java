import java.util.Scanner;

public class Foot {
    public static void main(String[] args) {
        draw();
    }

    public static void draw() {
        FootShape footShape = new FootShape();
        Scanner inp = new Scanner(System.in);
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
