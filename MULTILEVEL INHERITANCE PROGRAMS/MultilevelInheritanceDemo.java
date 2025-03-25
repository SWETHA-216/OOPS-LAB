// Base class (Grandparent)
class Person {
    void showIdentity() {
        System.out.println("I am a person.");
    }
}

// Derived class (Parent)
class Student extends Person {
    void study() {
        System.out.println("I am studying.");
    }
}

// Derived class (Child)
class CollegeStudent extends Student {
    void attendLecture() {
        System.out.println("I am attending a college lecture.");
    }
}

// Main class
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        CollegeStudent student = new CollegeStudent();
        
        // Calling methods from different levels of inheritance
        student.showIdentity();   // Inherited from Person
        student.study();          // Inherited from Student
        student.attendLecture();  // Defined in CollegeStudent
    }
}
