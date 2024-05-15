package example01;
public class Rectangle {
    /*
     * Fields
     */
    private int height;
    private int width;

    /*
     * Constructors
     */
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
        this.height = 0;
        this.width = 0;
    }

    /*
     * Gettes & setters
     */
    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    /*
     * Instance methods
     */
    public int calculatePerimeter() {
        return 2 * (width + height);
    }

    public int calculateArea(){
        return height * width;
    }

}
