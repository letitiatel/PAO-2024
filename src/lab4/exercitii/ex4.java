package lab4.exercitii;

import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 4, 5, 6, 6};

        int length = removeDuplicates(nums);

        System.out.println("Vectorul fara duplicate:");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nLungimea vectorului fara duplicate: " + length);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int l = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[l]) {
                l++;
                nums[l] = nums[i];
            }
        }

        return l + 1;
    }
}
