package Parciales.P1.PracticaFranco.Ej1;

import java.util.Arrays;

public class LimitedExam extends Exam{

    private String[] pending;
    private int max;
    private int dim;
    private static final int INITIAL_SIZE = 5;

    public LimitedExam(String name, int max){
        super(name);
        this.max = max;
        this.pending = new String[INITIAL_SIZE];
    }

    @Override
    public void enroll(String student){
        if (!isEnrolled(student)){
            if (getEnrolledCount() != max) {
                super.enroll(student);
            }else{
                if(dim == pending.length) {
                    resize();
                }
                pending[dim++] = student;
            }
        }
    }
    public void unenroll(String student) {
        int dimBefore = getEnrolledCount();
        super.unenroll(student);
        if (dimBefore != getEnrolledCount()){
            super.enroll(pending[0]);
            System.arraycopy(pending, 1, pending, 0, --dim);
        }
    }

    public boolean isEnrolled(String student) {
        return super.isEnrolled(student);
    }

    @Override
    public int getEnrolledCount() {
        return super.getEnrolledCount();
    }

    public String[] getPendingStudents() {
        return Arrays.copyOf(pending, dim);
    }

    private void resize() {
        pending = Arrays.copyOf(pending, pending.length + INITIAL_SIZE);
    }

}
