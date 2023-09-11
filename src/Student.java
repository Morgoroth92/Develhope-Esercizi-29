public class Student extends CollegePerson implements LearningPerson{
    private int academicYear;

    public Student(String name, String surname, int collegeId, int academicYear) {
        super(name, surname, collegeId);
        this.academicYear = academicYear;
    }

    @Override
    public void studyAtHome() {
        System.out.printf("The student of the %d  academic year is studying at home %n", academicYear);
    }
}