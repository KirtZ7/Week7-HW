public class Wall {
    private double width;
    private double height;

    // Constructors
    public Wall() {
        this(0, 0);
    }

    //Enter data here
    public static void printWall(Wall wall) {
        wall.setWidth(20);
        wall.setHeight(42);
    }
    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // getArea method
    public double getArea() {
        return width * height;
    }

    // printWall method
    public static void main(String[] args) {
        Wall wall = new Wall();
        Wall.printWall(wall);
        System.out.println("Width: " + wall.getWidth());
        System.out.println("Height: " + wall.getHeight());
        System.out.println("Area: " + wall.getArea());
    }

}
