public class Square {
    int sideLength;

    public void square(int sideLength) {
        this.sideLength = sideLength;
    }

    public double area() {
        return 2 * sideLength;
    }

    public double perimeter() {
        return Math.pow(sideLength, 2);
    }

    public double diagonal() {
        return sideLength * Math.sqrt(2);
    }
}
