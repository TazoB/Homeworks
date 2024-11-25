public class Rectangle {
    double length;
    double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double perimeter(){
        return (length + width) * 2;
    }

    public double area(){
        return length * width;
    }

    public double diagonal(){
        return Math.sqrt(length * length + width * width);
    }

    public boolean isSquare(){
        if(length != width){
            return false;
        }
        return true;
    }
}
