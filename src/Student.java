public class Student {
    private String name;
    private int id;
    private int year;

    public void Student(String name, int id, int year) {
        this.name = name;
        this.id = id;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
                "ID: " + this.id + "\n" +
                "Year: " + this.year;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }
}