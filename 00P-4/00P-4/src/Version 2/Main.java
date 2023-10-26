public class Main {
    public static void main(String[] args) {
        
	TeacherGroup<Teacher> teachers = new TeacherGroup<>("Teachers: ");
        
	teachers.add(new ChemistryTeacher("Раиса", "Васильевна"));
    teachers.add(new MathTeacher("Софья", "Марковна"));
    teachers.add(new PhysicTeacher("Петр", "Павлович"));
	teachers.add(new MusicTeacher("Валентина", "Андреевна"));
	teachers.add(new IstoryTeacher("Степан", "Маркович"));

        for (int index = 0; index < teachers.count(); index++) {
            System.out.println(teachers.get(index));
        }
    }
}
