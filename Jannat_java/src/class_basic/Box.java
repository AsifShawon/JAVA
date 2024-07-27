package class_basic;

public class Box {
    private double width, height, depth;

    public Box(){
        width = 5;
        height = 10;
        depth = 2;
    }
    public Box(double len){
        width = height = depth = len;
    }

    public Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(Box box){
        width = box.width;
        depth = box.depth;
        height = box.height;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setDim(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public boolean equalTo(Box o){
        return (o.width==width && o.height==height && o.depth==depth);
    }

    public double volume(){
        return height*width*depth;
    }

    @Override
    public String toString() {
        return "Box[width=" + width + ",height=" + height + ",depth=" + depth + "]";
    }
}
