public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {
    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("The Assistant is studying for the PhD");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("The Assistant is teaching to the class");
    }
}