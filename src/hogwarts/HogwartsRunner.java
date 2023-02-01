package hogwarts;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

public class HogwartsRunner {
    public static void main(String[] args) {
        Hogwarts hogwarts = new Hogwarts();
        Faculty gryffindor = new Gryffindor();
        Faculty slytherin = new Slytherin();
        Faculty hufflepuff = new Hufflepuff();
        hogwarts.setFaculties(List.of(gryffindor,slytherin,hufflepuff));
        gryffindor.makeMagic();
        slytherin.makeMagic();
        hufflepuff.makeMagic();

        Subject transfiguration = new Subject();
        Subject charms = new Subject();
        Subject potion = new Subject();
        gryffindor.setSubjects(List.of(transfiguration, charms, potion));
        slytherin.setSubjects(List.of(transfiguration, charms, potion));
        hufflepuff.setSubjects(List.of(transfiguration, charms, potion));

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.UP);
        Student ben = new Student("Ben");
        List<Integer> benTransfigurationGrades = List.of(10,20,30);
        ben.setGrade(transfiguration, benTransfigurationGrades);
        List<Integer> benCharmsGrades = List.of(40, 50, 60);
        ben.setGrade(charms, benCharmsGrades);
        List<Integer> benPotionGrades = List.of(70,80,90);
        ben.setGrade(potion, benPotionGrades);
        System.out.println("Ben's transfiguration grade: " + df.format(ben.getGrade(transfiguration)));
        System.out.println("Ben's average grade: " + df.format(ben.getAverageGrade()));

        Student elia = new Student("Elia");
        List<Integer> eliaTransfigurationGrades = List.of(20,30,40);
        elia.setGrade(transfiguration, eliaTransfigurationGrades);
        List<Integer> eliaCharmsGrades = List.of(50, 55, 60);
        elia.setGrade(charms, eliaCharmsGrades);
        List<Integer> eliaPotionGrades = List.of(80,90,100);
        elia.setGrade(potion, eliaPotionGrades);
        System.out.println("Elia's average grade: " + df.format(elia.getAverageGrade()));

        Student dzianis = new Student("Dzianis");
        List<Integer> dzianisTransfigurationGrades = List.of(5,10,20);
        dzianis.setGrade(transfiguration, dzianisTransfigurationGrades);
        List<Integer> dzianisCharmsGrades = List.of(30, 40, 50);
        dzianis.setGrade(charms, dzianisCharmsGrades);
        List<Integer> dzianisPotionGrades = List.of(60,70,80);
        dzianis.setGrade(potion, dzianisPotionGrades);
        System.out.println("Dzianis' average grade: " + df.format(dzianis.getAverageGrade()));

        Student matan = new Student("Matan");
        List<Integer> matanTransfigurationGrades = List.of(5,10,20);
        matan.setGrade(transfiguration, matanTransfigurationGrades);
        Student inbal = new Student("Inbal");
        List<Integer> inbalTransfigurationGrades = List.of(5,10,20);
        inbal.setGrade(transfiguration, inbalTransfigurationGrades);
        Student asaf = new Student("Asaf");
        List<Integer> asafTransfigurationGrades = List.of(5,10,20);
        asaf.setGrade(transfiguration, asafTransfigurationGrades);
        Student ofer = new Student("Ofer");
        List<Integer> oferTransfigurationGrades = List.of(5,10,20);
        ofer.setGrade(transfiguration, oferTransfigurationGrades);
        Student yarden = new Student("Yarden");
        List<Integer> yardenTransfigurationGrades = List.of(5,10,20);
        yarden.setGrade(transfiguration, yardenTransfigurationGrades);
        gryffindor.setStudents(List.of(ben, matan, inbal, asaf, ofer, yarden));
        System.out.println("Gryffindor students count: " + gryffindor.getStudentsCount());

        Student yael = new Student("Yael");
        List<Integer> yaelTransfigurationGrades = List.of(5,10,20);
        yael.setGrade(transfiguration, yaelTransfigurationGrades);
        Student ofir = new Student("Ofir");
        List<Integer> ofirTransfigurationGrades = List.of(5,10,20);
        ofir.setGrade(transfiguration, ofirTransfigurationGrades);
        slytherin.setStudents(List.of(elia,yael,ofir));
        System.out.println("Slytherin students count: " + slytherin.getStudentsCount());

        Student boris = new Student("Boris");
        List<Integer> borisTransfigurationGrades = List.of(5,10,20);
        boris.setGrade(transfiguration, borisTransfigurationGrades);
        Student dima = new Student("Dima");
        List<Integer> dimaTransfigurationGrades = List.of(5,10,20);
        dima.setGrade(transfiguration, dimaTransfigurationGrades);
        Student alex = new Student("Alex");
        List<Integer> alexTransfigurationGrades = List.of(5,10,20);
        alex.setGrade(transfiguration, alexTransfigurationGrades);
        hufflepuff.setStudents(List.of(dzianis,boris,dima,alex));
        System.out.println("Hufflepuff students count: " + hufflepuff.getStudentsCount());

        hogwarts.getBestClass();



    }
}
