import java.util.Random;
public class Student implements Comparable<Student> {
    public short ID;
    public int[] gpaArray;

    public float getGpa(){
        int sum = 0;
        for (int i = 0; i < 5; i++){
            sum += gpaArray[i];
        }
        return (float) sum /5;
    }
    public Student(){
        Random r = new Random();
        this.ID = (short) r.nextInt(Short.MAX_VALUE + 1);
        this.gpaArray = new int[5];
        for (int i = 0; i < 5; i++){
            gpaArray[i] = r.nextInt(2,6);
        }
    }
    @Override
    public int compareTo(Student student){
        return Float.compare(this.getGpa(), student.getGpa());
    }
}
