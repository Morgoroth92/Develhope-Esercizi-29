

public class TestCollege {
    public static void main(String[] args) {
        Student student = new Student("Marco", "Paoli", 1412501, 2023);
        Professor professor = new Professor("Loredana", "Rossi", 2052451, "History");
        Assistant assistant = new Assistant("Luca", "Verdi", 342301, true);


        student.goToCollege();
        professor.goToCollege();
        assistant.goToCollege();


        student.studyAtHome();
        professor.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}