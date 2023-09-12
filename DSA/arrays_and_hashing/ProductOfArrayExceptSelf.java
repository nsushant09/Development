package DSA.arrays_and_hashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelfConstantSpace(new int[] {1,2,3,4})));
    }

    public static int[] productExceptSelf(int[] nums) {

        int [] prefix = new int[nums.length];
        int [] postfix = new int[nums.length];
        int [] output = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(i == 0)
                prefix[i] = nums[i];
            else
                prefix[i] = nums[i] * prefix[i - 1];
        }

        for(int i = nums.length - 1; i >=0 ; i--){
            if(i == nums.length - 1)
                postfix[i] = nums[i];
            else
                postfix[i] = nums[i] * postfix[i + 1];
        }

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                output[i] = postfix[i + 1];
                continue;
            }
            if(i == nums.length - 1){
                output[i] = prefix[i - 1];
                continue;
            }
            output[i] = prefix[i - 1] * postfix[i + 1];
        }

        return output;
    }

    public static int[] productExceptSelfConstantSpace(int[] nums){
        int [] output = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i == 0)
                output[i] = 1;
            else
                output[i] = output[i - 1] * nums[i - 1];
        }

        int previousPostFix = 1;
        for(int i = nums.length - 1; i >=0; i--){
            if(i != nums.length - 1){
                output[i] = output[i] * (previousPostFix * nums[i + 1]);
                previousPostFix *= nums[i + 1];
            }
        }
        return output;
    }
}

//Optimize it to use o (1) memory
// store prefix in output array
// store postfix in output array
// compute within it and return
