class Arrays {

    boolean array6(int[] nums, int index) {
        if (index == nums.length) {
            return false;
        } else if (nums[index] == 6) {
            return true;
        } else {
            return array6(nums, index + 1);
        }
    }

    int array11(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        } else if (nums[index] == 11) {
            return 1 + array11(nums, index + 1);
        } else {
            return array11(nums, index + 1);
        }
    }
}
