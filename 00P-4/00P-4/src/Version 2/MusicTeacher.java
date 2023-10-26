public class MusicTeacher extends Teacher{

    protected MusicTeacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "MusicTeacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
