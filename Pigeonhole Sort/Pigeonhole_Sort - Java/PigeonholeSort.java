import java.util.ArrayList;

public class PigeonholeSort {
    public static void pigeonholeSort(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(0);
        int n = array.size();


        for (int i=1; i < n; i++) {
            int tmp = array.get(i);
            if (tmp < min)
                min = tmp;
            if (tmp > max)
                max = tmp;
        }

        int range = max - min + 1;
        ArrayList<ArrayList<Integer>> holes = new ArrayList<ArrayList<Integer>>(range);
        for (int i=0; i < range; i++) {
            holes.add(new ArrayList<>());
        }
        for (int i=0; i < n; i++) {
            holes.get(array.get(i) - min).add(array.get(i));
        }

        int index = 0;
        for (int i=0; i < range; i++) {
            int count = holes.get(i).size();
            for (int j = 0; j < count; j++) {
                array.set(index, holes.get(i).get(j));
                index++;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(6);
        array.add(3);
        array.add(8);
        array.add(25);
        array.add(3);
        array.add(2);
        array.add(7);
        array.add(8);

        pigeonholeSort(array);
        System.out.println(array);
    }
}
