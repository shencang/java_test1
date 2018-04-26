public class Rectangle {
    double height;
    double width;
    public Rectangle(double hight,double width){

        this.height= hight;
        this.width =width;
    }

    public double  area(){
        return height*width*1.0;

    }
    public double perimeter(){
        return 2.0*(width+height);
    }
}
