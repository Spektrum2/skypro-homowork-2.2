import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rn = new Random();
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", rn.nextInt(200), rn.nextInt(3000), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new Gryffindor("Гермиона Грейнджер", rn.nextInt(200), rn.nextInt(3000), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new Gryffindor("Рон Уизли", rn.nextInt(200), rn.nextInt(3000), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", rn.nextInt(200), rn.nextInt(3000), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new Hufflepuff("Седрик Диггори", rn.nextInt(200), rn.nextInt(3000), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new Hufflepuff("Джастин Финч-Флетчли", rn.nextInt(200), rn.nextInt(3000), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", rn.nextInt(200), rn.nextInt(3000), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new Ravenclaw("Падма Патил", rn.nextInt(200), rn.nextInt(3000), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new Ravenclaw("Маркус Белби", rn.nextInt(200), rn.nextInt(3000), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", rn.nextInt(200), rn.nextInt(3000), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new Slytherin("Грэхэм Монтегю", rn.nextInt(200), rn.nextInt(3000), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
                new Slytherin("Грегори Гойл", rn.nextInt(200), rn.nextInt(3000), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100), rn.nextInt(100)),
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