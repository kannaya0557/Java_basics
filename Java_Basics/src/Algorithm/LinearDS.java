package Algorithm;
import java.util.ArrayList;
public class LinearDS {
	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // Elements are stored contiguously
        list.add(4);
        list.add(2);

        // Print the elements of the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        // Alternatively, you can use the enhanced for-loop to iterate through the ArrayList
        System.out.println("Using enhanced for-loop:");
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}
