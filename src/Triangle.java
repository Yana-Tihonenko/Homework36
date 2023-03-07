public class Triangle {
    private int cathetusFirst;
    private int cathetusSecond;
    private int hypotenuse;

    public Triangle(int a, int b, int c) {
        if (checkSides(a, b, c) == true) {
            cathetusFirst = a;
            cathetusSecond = b;
            hypotenuse = c;
        } else {
            System.err.println("This is not a triangle");
        }

    }

    public double getCathetusFirst() {
        return cathetusFirst;
    }

    public void setCathetusFirst(int a) {
        if (checkSide(a) == true) {
            cathetusFirst = a;
        } else {
            System.err.println("Side length cannot be zero or less");
        }
    }

    public double getCathetusSecond() {
        return cathetusSecond;
    }

    public void setCathetusSecond(int b) {
        if (checkSide(b) == true) {
            cathetusSecond = b;
        } else {
            System.err.println("Side length cannot be zero or less");

        }
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(int c) {
        if (checkSide(c) == true) {
            hypotenuse = c;
        } else {
            System.err.println("Side length cannot be zero or less");
        }

    }

    public static boolean checkSides(int a, int b, int c) {
        //Длина каждой стороны треугольника меньше суммы длин двух других его сторон.
        if ((a + b < c) && (a + c < b) && (b + c < a)) {
            return true;
        }
        return false;
    }

    public static boolean checkSide(int a) {
        if (a > 0) {
            return true;
        }
        return false;
    }
}
