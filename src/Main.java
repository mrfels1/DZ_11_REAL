import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("---------------Task 1---------------");
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();

        Student[] list = {student1,student2,student3};
        Student[] list2 = {student4,student5,student6};

        for (Student student: list) {
            System.out.println(student.ID);
        }
        System.out.println();
        Sorting.insertionSort(list);
        for (Student student: list) {
            System.out.println(student.ID);
        }
        System.out.println("---------------Task 2---------------");
        System.out.println("Before sorting by gpa");
        for (Student student: list) {
            System.out.println(student.ID);
            for (int i: student.gpaArray){
                System.out.println(i);
            }
            System.out.println(student.getGpa());
            System.out.println();
        }

        Arrays.sort(list);
        System.out.println("After sorting by gpa");
        for (Student student: list) {
            System.out.println(student.ID);
            for (int i: student.gpaArray){
                System.out.println(i);
            }
            System.out.println(student.getGpa());
            System.out.println();
        }
        System.out.println("---------------Task 3---------------");
        System.out.println("First list");
        for (Student student: list) {
            System.out.println(student.ID);
        }
        System.out.println("Second list");
        for (Student student: list) {
            System.out.println(student.ID);
        }
        System.out.println("sorting....");
        Student[] c = Sorting.mergeSortTwo(list,list2);

        System.out.println("Result");
        for (Student student: c) {
            System.out.println(student.ID);
        }


    }
}