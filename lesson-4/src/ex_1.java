interface Shape {

    Shape rotatedShape(float deg);

    Shape movedShape(int x, int y);

    Shape flippedShape();

    void display();
}


class Rectangle implements Shape {

    private final int positionX;

    private final int positionY;

    private final float rotation;

    private final boolean isFlipped;

    public Rectangle(int positionX, int positionY, float rotation, boolean isFlipped) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.rotation = rotation;
        this.isFlipped = isFlipped;
    }

    @Override
    public Rectangle rotatedShape(float deg) {



        return new Rectangle(positionX, positionY, deg, isFlipped);
    }

    @Override
    public Rectangle movedShape(int x, int y) {
        return new Rectangle(x, y, rotation, isFlipped);
    }

    @Override
    public Rectangle flippedShape() {
        return new Rectangle(positionX, positionY, rotation, !isFlipped);
    }

    @Override
    public void display() {
        System.out.println(String.format("{%s position: x = %d y = %d rotation = %f isFlipped = %s }", getClass().toString(), positionX, positionY, rotation, Boolean.toString(isFlipped)));
    }


}

class Circle implements Shape {

    private final int positionX;

    private final int positionY;

    private final float rotation;

    private final boolean isFlipped;

    public Circle(int positionX, int positionY, float rotation, boolean isFlipped) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.rotation = rotation;
        this.isFlipped = isFlipped;
    }

    @Override
    public Circle rotatedShape(float deg) {

        return new Circle(positionX, positionY, deg, isFlipped);
    }

    @Override
    public Circle movedShape(int x, int y) {
        return new Circle(x, y, rotation, isFlipped);
    }


    @Override
    public Circle flippedShape() {
        return new Circle(positionX, positionY, rotation, !isFlipped);
    }

    @Override
    public void display() {
        System.out.println(String.format("{%s position: x = %d y = %d rotation = %f isFlipped = %s }", getClass().toString(), positionX, positionY, rotation, Boolean.toString(isFlipped)));
    }

}


public class ex_1 {


    public static void main(String[] args) {

        Shape rect = new Rectangle(1, 2, 361f, true);

        rect = rect.movedShape(3, 2);

        rect = rect.flippedShape();

        rect.rotatedShape(36);

        rect.display();

    }


}
