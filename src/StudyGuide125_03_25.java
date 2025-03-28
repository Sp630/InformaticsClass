import java.util.*;

public class StudyGuide125_03_25 {
    public static void main(String[] args) {
        Animal1 hipo = new Hipo();
        Hipo hipo1 = new Hipo();
        int[] nums = {1, 2, 3};
        int[][] num;
        num = new int[15][90];
        String str = " ";
        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);

        Set<Integer> set = new HashSet<Integer>();
        

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());


    }
}

interface Animal1{
    void eat();
}

class Hipo implements Animal1{
    public void eat(){
        System.out.println("Hipo eat");
    }
}
