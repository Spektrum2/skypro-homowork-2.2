public class SearchStrongestStudentFaculty {
    public void search(Gryffindor[] gryffindors, String name, String name2) {
        Gryffindor student1 = null;
        Gryffindor student2 = null;
        for (Gryffindor student : gryffindors) {
            if (student.getStudent().equals(name)) {
                student1 = student;
            } else if (student.getStudent().equals(name2)) {
                student2 = student;
            }
        }
        int point1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int point2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        if (point1 > point2) {
            System.out.println(student1.getStudent() + " лучший Гриффиндорец, чем " + student2.getStudent());
        } else {
            System.out.println(student2.getStudent() + " лучший Гриффиндорец, чем " + student1.getStudent());
        }

    }

    public void search(Hufflepuff[] hufflepuffs, String name, String name2) {
        Hufflepuff student1 = null;
        Hufflepuff student2 = null;
        for (Hufflepuff student : hufflepuffs) {
            if (student.getStudent().equals(name)) {
                student1 = student;
            } else if (student.getStudent().equals(name2)) {
                student2 = student;
            }
        }
        int point1 = student1.getDiligence() + student1.getLoyalty() + student1.getHonesty();
        int point2 = student2.getDiligence() + student2.getLoyalty() + student2.getHonesty();
        if (point1 > point2) {
            System.out.println(student1.getStudent() + " лучший Пуффендуец, чем " + student2.getStudent());
        } else {
            System.out.println(student2.getStudent() + " лучший Пуффендуец, чем " + student1.getStudent());
        }

    }

    public void search(Ravenclaw[] ravenclaws, String name, String name2) {
        Ravenclaw student1 = null;
        Ravenclaw student2 = null;
        for (Ravenclaw student : ravenclaws) {
            if (student.getStudent().equals(name)) {
                student1 = student;
            } else if (student.getStudent().equals(name2)) {
                student2 = student;
            }
        }
        int point1 = student1.getIntelligence() + student1.getWisdom() + student1.getWit() + student1.getCreativity();
        int point2 = student2.getIntelligence() + student2.getWisdom() + student2.getWit() + student2.getCreativity();
        if (point1 > point2) {
            System.out.println(student1.getStudent() + " лучший Когтевранец, чем " + student2.getStudent());
        } else {
            System.out.println(student2.getStudent() + " лучший Когтевранец, чем " + student1.getStudent());
        }

    }

    public void search(Slytherin[] slytherins, String name, String name2) {
        Slytherin student1 = null;
        Slytherin student2 = null;
        for (Slytherin student : slytherins) {
            if (student.getStudent().equals(name)) {
                student1 = student;
            } else if (student.getStudent().equals(name2)) {
                student2 = student;
            }
        }
        int point1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getLustForPower();
        int point2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getLustForPower();
        if (point1 > point2) {
            System.out.println(student1.getStudent() + " лучший Слизеринец, чем " + student2.getStudent());
        } else {
            System.out.println(student2.getStudent() + " лучший Слизеринец, чем " + student1.getStudent());
        }

    }
}
