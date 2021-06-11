package day38_methods;

public class ArraysUtilTest {
    public static void main(String[] args) {
        int[] nums = {5, 23, 1, 543, 90};

        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[]{23,64,23,534,234,45,234,45});

        System.out.println("sum = " + ArrayUtils.sum(nums));
        System.out.println("sum = " + ArrayUtils.sum(new int[]{23,64,23,534,234,45,234,45}));

        int[] nums2 = {4, 1, 5, 8};
        int num = 5;
        boolean found = false;

        for(int each : nums2) {
            if(each == num) {
                found = true;
                break;
            }
        }

        System.out.println("found = " + found);
    }
}
