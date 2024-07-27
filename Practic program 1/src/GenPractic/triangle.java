package GenPractic;

public class triangle<T extends Number> implements Figure{
    T[] data;

    public triangle(T[] data){
      this.data = data;
    }

    @Override
    public Double area() {
        Double s= (data[0].doubleValue()+data[1].doubleValue()+data[2].doubleValue())/2;
        Double area = Math.sqrt(s*(s-data[0].doubleValue())*(s-data[1].doubleValue())*(s-data[2].doubleValue()));

        return area;
    }
}
