package org.example;


public class Main {
    public static void main(String[] args) {

        University university1 = new UniversityBuilder ().setId ("1").setFullName ("University of Harvard").setShortName ("Harvard").
                setYearOfFoundation (1890).setMainProfile (StudyProfile.JURISPRUDENCE).createUniversity ();
        University university2 = new UniversityBuilder ().setId ("2").setFullName ("University of Oxford").setShortName ("Oxford").
                setYearOfFoundation (1905).setMainProfile (StudyProfile.FINANCIAL).createUniversity ();
        University university3 = new UniversityBuilder ().setId ("3").setFullName ("University of Oakland").setShortName ("Oakland").
                setYearOfFoundation (1910).setMainProfile (StudyProfile.MANAGEMENT).createUniversity ();
        University university4 = new UniversityBuilder ().setId ("4").setFullName ("University of Cambridge").setShortName ("Cambridge").
                setYearOfFoundation (1955).setMainProfile (StudyProfile.ADMINISTRATION).createUniversity ();
        Student student1 = new StudentBuilder ().setFullName ( "John Johnson" ).setUniversityId ( "1" ).setCurrentCourseNumber ( 1 ).
                setAvgExamScore ( 5.0F ).createStudent ();
        Student student2 = new StudentBuilder ().setFullName ( "Jack Jackson" ).setUniversityId ( "2" ).setCurrentCourseNumber ( 2 ).
                setAvgExamScore ( 4.50F ).createStudent ();

        System.out.println (university1);
        System.out.println (university2);
        System.out.println (university3);
        System.out.println (university4);
        System.out.println (student1);
        System.out.println (student2);
    }
}