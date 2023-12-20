public class Temperature {
    private double temp;
    private char scale;

    public void Temperature(double temp) {
        this.temp = 0;
    }

    public void Temperature(char scale) {
        this.scale = 'C';
    }

    public void Temperature(double temp, char scale) {
        this.temp = temp;
        this.scale = scale;
    }

    public void Temperature() {
        this.temp = 0;
        this.scale = 'C';
    }

    public double getTempC(double temp) {
        return 5 * (temp - 32) / 9;
    }

    public double getTempF(double temp) {
        return 9 * (temp / 5) + 32;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setAll(double temp, char scale) {
        this.temp = temp;
        this.scale = scale;
    }

    @Override
    public String toString() {
        return "Температура: " + this.temp + "\n" +
                "Шкала: " + this.scale;
    }
}
