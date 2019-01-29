package task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TriangleSort {

    ArrayList<Triangle> triangleArrayList = new ArrayList<>();

    public void addTriangle() {
        triangleArrayList.add(Console.parseInPutLine());
    }

    public void sortTriangles() {
        Collections.sort(triangleArrayList, new TriangleSquareComparator());
        printResult();
    }

    public void printResult() {
        Iterator<Triangle> iterator = triangleArrayList.iterator();
        while (iterator.hasNext()) {
            Triangle triangle = iterator.next();
            Console.print(triangle);
        }
    }
}
