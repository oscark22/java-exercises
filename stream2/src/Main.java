import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        List<Integer> nums2 = nums.stream().distinct().toList();
        System.out.println(nums2);
    }
}