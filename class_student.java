class student {
    // Below are the attributes or field of a student
    public int m1, m2, m3 ;
    public double  h1;
    public int roll_no ;
    public String name;
    public String surname;

    public String grade = "Fail";

    // Below are the behavior or the methods of a student

    public int total_marks () {
        int total = m1 + m2 + m3;
        return total;
    }
    public int average() {
         return   total_marks()/3;
    }
    public String grade ( int m1 ,int  m2,int m3) {
        if ( average() > 50 ){
            grade = " Pass" ;
        }
        return grade ;
    }

}
public class class_student {
    public static void main(String[] args) {

        student s = new student();
        System.out.println( s.grade( 21,65,89 ) );
    }
}
