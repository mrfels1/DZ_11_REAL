public class Sorting {
    public static void insertionSort(Student[] list){
        int n = list.length;
        for (int j = 1; j < n; j++) {
            Student key = list[j];
            int i = j-1;
            while ( (i > -1) && ( list[i].ID > key.ID ) ) {
                list [i+1] = list [i];
                i--;
            }
            list[i+1] = key;
        }
    }

    public static Student[] mergeSortTwo(Student[] a, Student[] b){
        int n = a.length + b.length;
        Student[] c = new Student[n];
        for (int i = 0; i < n; i++) {
            if (i < 3){
                c[i] = a[i];
            }
            else {
                c[i] = b[n-i-1];
            }
        }
        mergeSort(c,n);
        return c;
    }
    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].ID <= r[j].ID) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
