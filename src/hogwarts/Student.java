package hogwarts;

import java.util.*;

public class Student {
    private String name;
    private Map<Subject, List<Integer>> allGrades = new HashMap<>();
    public Student(String name){
        this.name = name;
    }
    public void setGrade(Subject subject, List<Integer> grades){
        allGrades.put(subject, grades);
    }
    public double getGrade(Subject subject){
        List<Integer> subjectGrades = allGrades.get(subject);
        int sum = 0;
        for(Integer grade:subjectGrades){
           sum += grade;
        }
        return (double) sum/subjectGrades.size();
    }

    public double getAverageGrade(){
        Set<Subject> subjects = allGrades.keySet();
        double totalAverageGrade = 0;
        for (Subject subject: subjects){
             totalAverageGrade += getGrade(subject);
        }
        return totalAverageGrade/subjects.size();

    }
}
