package Expt_2;

public class Main {
    public static void main(String[] args) {
        Programme programme = new Programme();
        programme.initializeUniversity("Jain University", "Bengaluru");
        programme.initializeSchool("CS & IT", 5);
        programme.initializeDepartment("Computer Science", 5);
        programme.initializeProgramme("Masters of Computer Science", 60);

        System.out.println("---- Program Details ----");
        programme.displayProgramme();

        Faculty faculty = new Faculty();
        faculty.initializeUniversity("Jain University", "Bengaluru");
        faculty.initializeSchool("CS & IT", 5);
        faculty.initializeDepartment("Computer Science", 5);
        faculty.initializeFaculty("Declan Dmello", 13);
    }
}
