package hogwarts;

import java.util.List;

public abstract class Faculty {
    public abstract void makeMagic();
    private List <Student> students;
    private List <Subject> subjects;

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public int getStudentsCount(){
        return students.size();
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public double getAverageFacultyGrade(){
        double gradesSum = 0;
        for(Student student:students){
            gradesSum += student.getAverageGrade();
        }
        return gradesSum/students.size();
    }

}
