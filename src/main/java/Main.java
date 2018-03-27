public class Main {

    public static void main(String[] args) {
        OverlapCalculator overlapCalculator = new OverlapCalculator();
        int overlap1 = overlapCalculator.calculateOverlap(-1, -1, 10, 10, -1, 0 , 3, 9);
        System.out.println(overlap1);

        System.out.println(overlapCalculator.calculateOverlap(-12, -4, -1, -2, 0,0, 100, 3000));
        System.out.println(overlapCalculator.calculateOverlap(-1,-1, 10, 10, -1, -1, 10, 10));
        System.out.println(overlapCalculator.calculateOverlap(-1,-1, 10, 10, 2,2,5,5));

    }


}
