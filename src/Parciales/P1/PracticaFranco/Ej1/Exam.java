package Parciales.P1.PracticaFranco.Ej1;

import java.util.Arrays;

public class Exam {

    private String name;

    private String[] enrolled;
    private int dim;
    private static final int INITIAL_DIM = 5;

    public Exam(String name) {
        this.name = name;
        this.enrolled = new String[INITIAL_DIM];
    }

    public void enroll(String student) {
        if(dim == enrolled.length) {
            resize();
        }
        enrolled[dim++] = student;
        System.out.println("Enrolled " + student);
    }

    public void unenroll(String student) {
        for(int i = 0; i < dim; i++) {
            if(enrolled[i].equals(student)) {
                System.arraycopy(enrolled, i + 1, enrolled, i, dim - 1 - i);
                dim--;
                System.out.println("Unenrolled " + student);
            }
        }
    }

    public boolean isEnrolled(String student) {
        for(int i = 0; i < dim; i++) {
            if(enrolled[i].equals(student)) {
                return true;
            }
        }
        return false;
    }

    public int getEnrolledCount() {
        return dim;
    }

    public String[] getEnrolledStrudents() {
        return Arrays.copyOf(enrolled, dim);
    }

    private void resize() {
        enrolled = Arrays.copyOf(enrolled, enrolled.length + INITIAL_DIM);
    }

}
