import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rn = new Random();
        Hogwarts[] students = {
                new Hogwarts("Гарри Поттер", 190, 2991),
                new Hogwarts("Гермиона Грейнджер", 158, 2319),
                new Hogwarts("Рон Уизли", 50, 840),
                new Hogwarts("Захария Смит", 102, 1932),
                new Hogwarts("Седрик Диггори", 162, 1624),
                new Hogwarts("Джастин Финч-Флетчли", 112, 1275),
                new Hogwarts("Чжоу Чанг", 113, 2071),
                new Hogwarts("Падма Патил", 123, 244),
                new Hogwarts("Маркус Белби", 90, 1793),
                new Hogwarts("Драко Малфой", 146, 1137),
                new Hogwarts("Грэхэм Монтегю", 130, 675),
                new Hogwarts("Грегори Гойл", 42, 126),
        };
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 190, 2991, rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new Gryffindor("Гермиона Грейнджер", 158, 2319, rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new Gryffindor("Рон Уизли", 50, 840, rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 102, 1932, rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new Hufflepuff("Седрик Диггори", 162, 1624, rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new Hufflepuff("Джастин Финч-Флетчли", 112, 1275, rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 113, 2071, rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new Ravenclaw("Падма Патил", 123, 244, rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new Ravenclaw("Маркус Белби", 90, 1793, rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 146, 1137, rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new Slytherin("Грэхэм Монтегю", 130, 675, rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new Slytherin("Грегори Гойл", 42, 126, rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
        };
        PrintStudent printStudent = new PrintStudent();
        SearchStrongestStudentFaculty searchStrongestStudentFaculty = new SearchStrongestStudentFaculty();
        printStudent.print(slytherins, "Драко Малфой");
        printStudent.print(slytherins, "Грегори Гойл");
        searchStrongestStudentFaculty.search(slytherins, "Драко Малфой", "Грегори Гойл");
        searchStrongestStudent(students, "Драко Малфой", "Рон Уизли");
    }

    private static void searchStrongestStudent(Hogwarts[] students, String name, String name2) {
        Hogwarts student1 = null;
        Hogwarts student2 = null;
        for (Hogwarts student : students) {
            if (student.getStudent().equals(name)) {
                student1 = student;
            } else if (student.getStudent().equals(name2)) {
                student2 = student;
            }
        }
        if (student1.getPowerOfMagic() > student2.getPowerOfMagic()) {
            System.out.println(student1.getStudent() + " обладает большей мощностью магии, чем " + student2.getStudent());
        } else {
            System.out.println(student2.getStudent() + " обладает большей мощностью магии, чем " + student1.getStudent());
        }
        if (student1.getTransgression() > student2.getTransgression()) {
            System.out.println(student1.getStudent() + " расстояние трансгрессии дальше, чем " + student2.getStudent());
        } else {
            System.out.println(student2.getStudent() + " расстояние трансгрессии дальше, чем " + student1.getStudent());
        }
    }
}