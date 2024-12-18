import java.util.*;

class Com implements Comparator {
    public int compare(Integer ob1, Integer ob2) {
        int o1 = ob1.intValue();
        int o2 = ob2.intValue();
    
        if(o1 > o2)
            retun 1;
        else if(o1 < o2)
            return -1;
        else
            return 0;
        }
    }

public class Test {
    public static void main(String[] a){
        ArrayList<Integer> al = new ArrayList<Interger>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        for(String i = 0 : inputArr) {
            al.add(Integer.valueOf(i));
        }

        al.sort(new Com());
        for(Integer i : al) {

        }
    }
}