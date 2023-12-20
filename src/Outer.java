public class Outer {
    private int number = 1;

    class Inner {
        public int getOuter() {
            Outer outer = new Outer();
            return outer.number + 1;
        }
    }
}
