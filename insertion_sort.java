private static int[] insertion_sort(int[] nums) {
        for(int i=1;i<nums.length;i++){
            int current=nums[i];
            int j=i-1;
            while(j>=0&& current<nums[j]){//this is for desending
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=current;
        }
        return nums;

    }
