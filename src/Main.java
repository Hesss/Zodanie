import java.util.*;

public class Main {
    public static <T> Collection<T> delRepeat(Collection<T> col) {
        return new HashSet<>(col);
    }

    public static void addLinkedLists(LinkedList<Integer> linkedList){
        int N = 1000000;
        for (int i = 0; i < N; i++) {
            linkedList.add(rnd(100));
        }
    }

    public static void addArrayLists(ArrayList<Integer> arrayList) {
        int N = 1000000;
        for (int i = 0; i < N; i++) {
            arrayList.add(rnd(100));
        }
    }

    public static void getLinkedLists(LinkedList<Integer> linkedList) {
        final int M = 100000;
        int linkedSize = linkedList.size();
        for (int i = 0; i < M; i++) {
            linkedList.get(rnd(linkedSize-1));
        }
    }

    public static void getArrayLists(ArrayList<Integer> arrayList) {
        int M = 100000;
        int arraySize = arrayList.size();
        for (int i = 0; i < M; i++) {
            arrayList.get(rnd(arraySize-1));
        }
    }

    public static int rnd(int max) {
        return (int) (Math.random() * ++max);
    }

    public static void main(String[] args) {
        //задание1
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,3,3,4,5,6,7));
        System.out.println(numbers);
        System.out.println(delRepeat(numbers));

        //задание2
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

            long startTime = System.currentTimeMillis();
        addArrayLists(arrayList);
            long endTime = System.currentTimeMillis();
            System.out.println("Время добавления элементов в arrayList = " + (endTime - startTime));

            startTime = System.currentTimeMillis();
        addLinkedLists(linkedList);
            endTime = System.currentTimeMillis();
            System.out.println("Время добавления элементов в linkedList = " + (endTime - startTime));

            startTime = System.currentTimeMillis();
        getArrayLists(arrayList);
            endTime = System.currentTimeMillis();
            System.out.println("Время получения элементов в arrayList = " + (endTime - startTime));

            startTime = System.currentTimeMillis();
        getLinkedLists(linkedList);
            endTime = System.currentTimeMillis();
            System.out.println("Время получения элементов в linkedLists = " + (endTime - startTime)); // обращение по индексу в linkedlist
                                                                                                      // происходит значииительно дольше т.к. эта операция в linkedlist
                                                                                                      // производятся перебором с начала или конца до нужного элемента
        }

}
