package task_3;

public class Runner {

    public void run(){
        TriangleSort triangleSort = new TriangleSort();
        int count = 1;
        boolean runCycle = true;

        while (runCycle) {
            triangleSort.addTriangle();
            if (count >= 2) {
                runCycle = Console.confirm();
            }
            count++;
        }
        triangleSort.sortTriangles();
    }
}
