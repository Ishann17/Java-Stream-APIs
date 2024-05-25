import java.util.List;

public class FilterNumWithOne {
    public static void main(String[] args) {
        //find out all the numbers starting with 1 using Stream functions?
        List<Integer> lol = List.of(10,15,8,49,25,98,32,111,132,1142);
        List<Integer> result = lol.stream().filter(i->String.valueOf(i).startsWith("1")).toList();
        System.out.println(result);
    }
}
