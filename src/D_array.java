public class D_array {
    public static void main(String[] args) {
//        2D Array in Java
        int[][] marks = {{123, 456, 789}, {987, 654, 321}};
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}