package Lesson10;


public class Student {
    private int rating;
    private String name;

    //конструктор
    public Student(int rating) {
        this.rating = rating;
        this.name = toString();
    }

    public int getRating() {

        return rating;
    }

    public String getName() {

        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;
        return rating == student.rating;
    }

    @Override
    public String toString() {
        return Student.class.getName() + "@" + hashCode();
    }
}
