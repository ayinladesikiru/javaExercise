package chapterThree;

public class ArrayOneDimension {
    public static void main(String[] args) {

        int[] nums = new int[300];

        for(int i = 0; i < nums.length; i++){
            nums[i] = i + 1;
        }

        for (int i = 0; i < nums.length - 1; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.println(nums[299]);

    }
}
