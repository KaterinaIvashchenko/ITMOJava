package Lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    private static Map<String, Integer> top = new HashMap<>();

    public static void main(String[] args) {

        List<Student> students1 = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int rating = (int) (Math.random() * 5) + 1;
            Student student = new Student(rating);
            if (i % 2 == 0) {
                students1.add(student);
            } else if (i % 3 == 0) {
                students2.add(student);
            } else {
                students1.add(student);
                students2.add(student);
            }
        }

        Map<Integer, List<Student>> ratings = getReting(students1);
        printStudents(ratings);
    }

    private static List<Student> getSame(List<Student> student1, List<Student> student2) {
        List<Student> res = new ArrayList<>();
        for (Student student : student1) {
            if (student2.contains(student)) {
                res.add(student);
            }
        }
        return res;
    }

    private static void printStudents(List<Student> student1) {
        for (Student student : student1) {
            System.out.println(student.getName() + " : " + student.getRating());
        }
    }

    private static Map<Integer, List<Student>> getReting(List<Student> students) {
        Map<Integer, List<Student>> res = new HashMap<>();
        for (Student student : students) {
            Integer rating = student.getRating();
            if (!res.containsKey(rating)) {
                List<Student> studentList = new ArrayList<Student>();
                studentList.add(student);
                res.put(rating, studentList);
            } else {
                List<Student> studentList = res.get(rating);
                studentList.add(student);
            }
        }
        return res;
    }

    private static void printStudents(Map<Integer, List<Student>> students) {
        Integer maxRating = 0;
        for (Integer rating : students.keySet()) {
            if (rating > maxRating) maxRating = rating;
        }
        while (maxRating > 0) {
            if (students.containsKey(maxRating)) {
                System.out.println("" + maxRating + ":");
                for (Student student : students.get(maxRating)) {
                    System.out.println(student);
                }
                System.out.println("=========================");
                maxRating--;
            }
        }
    }

    private static void parse(String str) {
        String[] strs = str.replace(".", "")
        .replace(".", "")
        .replace(".", "")
        .replace(".", "")
        .split (" ");
        for (String s : strs) {
            Integer count;
            if ((count = top.get(s)) != null){
                count++;
            } else {
                top.put(s, 1);
            }
        }
    }
}