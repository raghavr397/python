class Student {
    int rno;
    String name;
    float marks;

    void display() {
        System.out.println("roll no. : " + this.rno + "    name: " + this.name + "   marks: " + this.marks);
    }

    Student() {
        rno = 0;
        name = null;
        marks = 0.0f;
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
        this.marks = 0.0f;
    }

    Student(Student otherStu) {
        this.name = otherStu.name;
        this.rno = otherStu.rno;
        this.marks = otherStu.marks;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student qwerty = new Student(30, "Qwert Keypad", 77.5f);
        Student rahul = new Student(10, "Rahul Roy");
        Student nikhil = new Student();
        Student copyStudent = new Student(qwerty);
        qwerty.display();
        rahul.display();
        nikhil.display();
        copyStudent.display();
    }
}