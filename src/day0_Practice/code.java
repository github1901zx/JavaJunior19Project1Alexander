package day0_Practice;

public class code {
    public static void main(String[] args) {
        int [] nums = {14,1,84,97,1243,46};
        int total = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0) {
                total += 5;
            }else{
                total += 10;
            }
        }

        System.out.println(total);
        }
    }


