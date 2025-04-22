package Expt_2;

public class University {
    String univName;
    String address;

    public void initializeUniversity(String name, String addr) {
        this.univName = name;
        this.address =addr;
    }

     public void displayUniversity() {
        System.out.println("University Name: " + univName);
        System.out.println("Address: " + address);
    }
}

class School extends University {
    String schoolName;
    int numOfDepartments;

    void initializeSchool(String name, int departments){
        this.schoolName = name;
        this.numOfDepartments = departments;
    }

    void displaySchool() {
        displayUniversity();
        System.out.println("School Name: " + schoolName);
        System.out.println("Number of Departments: " + numOfDepartments);
    }
}

class Department extends School {
    String deptName;
    int numOfDepartments;

    void initializeDepartment(String name, int programmes) {
        this.deptName = name;
        this.numOfDepartments = programmes;
    }

    void displayDepartment() {
        displaySchool();
        System.out.println("Department Name: " + deptName);
        System.out.println("Number of Programmes: " + numOfDepartments);
    }
}

class Programme extends Department {
    String programmeName;
    int totalStudents;

    void initializeProgramme(String name, int students) {
        this.programmeName = name;
        this.totalStudents = students;
    }

    void displayProgramme() {
        displayDepartment();
        System.out.println("Programme Name: " + programmeName);
        System.out.println("Total Number of students: " + totalStudents);
    }
}

class Faculty extends Department {
    String facultyName;
    int experience;

    void initializeFaculty(String name, int exp) {
        this.facultyName = name;
        this.experience = exp;
    }

    void displayFaculty() {
        displayDepartment();
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Experience: " + experience + "years");
    }
}
