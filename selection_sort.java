public static int[] selection_sort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            int smaller=nums[i];
            int indexofmin =i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<smaller){
                    smaller=nums[j];
                    indexofmin=j;
                }
            }
        //swap
            int temp=0;
            temp=nums[i];
            nums[i]=smaller;
            nums[indexofmin]=temp;
        }
        return nums;
    }
