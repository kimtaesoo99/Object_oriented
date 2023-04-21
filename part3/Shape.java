package part3;

public enum Shape {

    Triangle("삼각형"),
    Square("사각형"),
    Circle("원"),
    Rabbit("토끼");


    final String info;

    Shape(String info) {
        this.info = info;
    }
}
