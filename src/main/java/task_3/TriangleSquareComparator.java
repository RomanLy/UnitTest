package task_3;

import java.util.Comparator;

public class TriangleSquareComparator implements Comparator<Triangle>{

    @Override
    public int compare(Triangle o1, Triangle o2) {
        Double square1 = o1.calculateSquare();
        Double square2 =o2.calculateSquare();
        return square2.compareTo(square1);
    }
}
