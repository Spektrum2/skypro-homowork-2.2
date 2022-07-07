public class PrintStudent {
    public void print(Gryffindor[] gryffindors, String name) {
        for (Gryffindor student : gryffindors) {
            if (student.getStudent().equals(name)) {
                System.out.println("Студент - " + student.getStudent() +
                        "; Сила магии - " + student.getPowerOfMagic() +
                        "; Расстояние трансгрессии - " + student.getTransgression() +
                        "; Благородство - " + student.getNobility() +
                        "; Честь - " + student.getHonor() +
                        "; Храбрость - " + student.getBravery());
            }
        }
    }

    public void print(Hufflepuff[] hufflepuffs, String name) {
        for (Hufflepuff student : hufflepuffs) {
            if (student.getStudent().equals(name)) {
                System.out.println("Студент - " + student.getStudent() +
                        "; Сила магии - " + student.getPowerOfMagic() +
                        "; Расстояние трансгрессии - " + student.getTransgression() +
                        "; Трудолюбие - " + student.getDiligence() +
                        "; Верность - " + student.getLoyalty() +
                        "; Искренность - " + student.getHonesty());
            }
        }
    }

    public void print(Ravenclaw[] ravenclaws, String name) {
        for (Ravenclaw student : ravenclaws) {
            if (student.getStudent().equals(name)) {
                System.out.println("Студент - " + student.getStudent() +
                        "; Сила магии - " + student.getPowerOfMagic() +
                        "; Расстояние трансгрессии - " + student.getTransgression() +
                        "; Ум - " + student.getIntelligence() +
                        "; Мудрость - " + student.getWisdom() +
                        "; Остроумие - " + student.getWit() +
                        "; Творчество - " + student.getCreativity());
            }
        }
    }

    public void print(Slytherin[] slytherins, String name) {
        for (Slytherin student : slytherins) {
            if (student.getStudent().equals(name)) {
                System.out.println("Студент - " + student.getStudent() +
                        "; Сила магии - " + student.getPowerOfMagic() +
                        "; Расстояние трансгрессии - " + student.getTransgression() +
                        "; Хитрость - " + student.getCunning() +
                        "; Решительность - " + student.getDetermination() +
                        "; Амбициозность - " + student.getAmbition() +
                        "; Находчивость - " + student.getResourcefulness() +
                        "; Жажда власти - " + student.getLustForPower());
            }
        }
    }
}
