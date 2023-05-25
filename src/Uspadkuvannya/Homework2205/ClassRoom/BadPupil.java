package Uspadkuvannya.Homework2205.ClassRoom;

public class BadPupil extends Pupil {
    public BadPupil(String name, int id, String gender) {
        super(name, id, gender);
    }

    public BadPupil(String name, int id) {
        super(name, id);
    }

    @Override
    public void relax() {
        super.relax();
    }
}