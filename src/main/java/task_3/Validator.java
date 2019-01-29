package task_3;

public class Validator {

    public static boolean isTriangleExist (
            double a, double b, double c){
        if ((a + b > c)&&(a + c > b)&&(c + b > a)){
            return true;
        }
        return false;
    }

}
