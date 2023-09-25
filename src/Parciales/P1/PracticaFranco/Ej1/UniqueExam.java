package Parciales.P1.PracticaFranco.Ej1;

public class UniqueExam extends Exam{
    public UniqueExam(String name){
        super(name);
    }

    public String[] getEnrolledStrudents() {
        return super.getEnrolledStrudents();
    }

    public void unenroll(String student) {
        super.unenroll(student);
    }

    public boolean isEnrolled(String student) {
        return super.isEnrolled(student);
    }

    public int getEnrolledCount() {
        return super.getEnrolledCount();
    }

    @Override
    public void enroll(String student){
        if (!isEnrolled(student)){
            super.enroll(student);
        }
    }

}
