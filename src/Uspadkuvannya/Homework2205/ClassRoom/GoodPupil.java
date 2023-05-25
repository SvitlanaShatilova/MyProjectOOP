package Uspadkuvannya.Homework2205.ClassRoom;

public class GoodPupil extends Pupil{
    public GoodPupil(String name, int id, String gender) {
        super(name, id, gender);
    }

    public GoodPupil(String name, int id) {
        super(name, id);
    }

    @Override
    public void read() {
        super.read();
    }

    @Override
    public void write() {
        super.write();
    }
}

