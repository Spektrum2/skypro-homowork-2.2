import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rn = new Random();
        GryffindorStudent[] gryffindors = {
                new GryffindorStudent("Гарри Поттер", rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new GryffindorStudent("Гермиона Грейнджер", rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new GryffindorStudent("Рон Уизли", rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
        };
        HufflepuffStudent[] hufflepuffs = {
                new HufflepuffStudent("Захария Смит", rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new HufflepuffStudent("Седрик Диггори", rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new HufflepuffStudent("Джастин Финч-Флетчли", rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
        };
        RavenclawStudent[] ravenclaws = {
                new RavenclawStudent("Чжоу Чанг", rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new RavenclawStudent("Падма Патил", rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new RavenclawStudent("Маркус Белби", rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
        };
        SlytherinStudent[] slytherins = {
                new SlytherinStudent("Драко Малфой", rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new SlytherinStudent("Грэхэм Монтегю", rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new SlytherinStudent("Грегори Гойл", rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
        };
        gryffindors[2].printStudent();
        gryffindors[1].printStudent();
        slytherins[0].printStudent();
        gryffindors[0].compareStudentFaculty(gryffindors[1]);
        hufflepuffs[0].compareStudentFaculty(hufflepuffs[1]);
        ravenclaws[2].compareStudentFaculty(ravenclaws[1]);
        slytherins[2].compareStudentFaculty(slytherins[1]);
        gryffindors[2].compareStudent(slytherins[0]);
    }
}