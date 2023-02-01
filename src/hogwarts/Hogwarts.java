package hogwarts;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Hogwarts {
    private List<Faculty> faculties;

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public void getBestClass(){
        Optional<Faculty> bestClass = faculties.stream().
                max(Comparator.comparing(Faculty::getAverageFacultyGrade));
        bestClass.ifPresent(faculty -> System.out.println("Hogwarts best class is " + faculty));
    }
}
