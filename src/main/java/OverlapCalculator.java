import static java.lang.Math.abs;

public class OverlapCalculator {
    public int calculateOverlap(int a1, int b1, int c1, int d1, int a2, int b2, int c2, int d2 ) {
        int a;
        int b;
        int c;
        int d;
        int overlap = 0;

        if ((a1 <= a2 && a2 <= c1) || (b1 <= b2 && b2 <= d1) || (a1 <= c2 && c2 <= c1) || (b1 <= d2 && d2 <= d1)) {

            a = a2 <= a1 ? a1 : a2;
            b = b2 >= b1 ? b2 : b1;
            c = c2 <= c1 ? c2 : c1;
            d = d2 <= d1 ? d2 : d1;

            overlap = abs((d-b)*(a-c));

        } return overlap;
    }
}
