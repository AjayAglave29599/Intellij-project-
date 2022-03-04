package Rectangle;

public class RectangleArea {

    int length;
    int breadth;
    int area;
    public void get(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    public void area()
    {
        area=length*breadth;
        System.out.println("Area of rectangle is = "+area);
    }
}
