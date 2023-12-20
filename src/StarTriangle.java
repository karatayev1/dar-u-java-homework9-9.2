public class StarTriangle {
    int n;

    public void starTriangle(int width) {
        this.n = width;
    }

    @Override
    public String toString() {
        String s = "";

        for (int i = this.n; i >= 1; i--) {
            for (int j = i; j <= this.n; j++) {
                s += "[*]";
            }
            s += "\n";
        }
        return s;
    }
}
