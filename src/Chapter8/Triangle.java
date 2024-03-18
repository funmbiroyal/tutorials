package Chapter8;

public class Triangle {
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculatePerimeter(int length, int width){
        return  2*(length + width);
    }

    public int calculateArea() {
        return length * width;
    }
}

