package chapterSix;

public class ArrayMulti {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        System.out.println(total);

// printing out the sum of multidimensional Array

        int[][] numsMulti = {{1, 2, 3},
                             {4, 5, 6, 9},
                             {7}};
        int sum = 0;
        for (int[] ints : numsMulti) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println(sum);


    }
}
