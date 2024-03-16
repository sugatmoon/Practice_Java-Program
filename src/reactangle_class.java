class reactangle {

    private double length ;
    private double breadth;

    public reactangle (int l , int b) {
        length = l ;
        breadth = b;

    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if( length > 0 ) {
            this.length = length;
        }
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth( double breadth ) {
        if( breadth > 0 ) {
            this.breadth  = breadth;
        }
    }


}
public class reactangle_class {
    public static void main(String[] args) {

        reactangle r = new reactangle(24,65);

        r.setBreadth(45);
        r.setLength(48);

        System.out.println( r.getBreadth() * r.getLength() );


    }
}
