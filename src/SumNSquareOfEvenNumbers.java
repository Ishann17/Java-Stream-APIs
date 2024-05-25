import java.util.List;

public class SumNSquareOfEvenNumbers {
    public static void main(String[] args) {
        //Find the sum of square of even numbers using Stream
        List<Integer> list = List.of(1,2,3,4,5, 6);
        int sum = list.stream().filter(i -> i%2==0).mapToInt(e -> e*e).sum();
        System.out.println(sum);
    }
}
