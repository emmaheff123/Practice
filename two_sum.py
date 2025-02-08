def twoSum(nums, target):
    n = len(nums)
    indices = []
    for i in range(0, n):
        for j in range(1, n):
            if (nums[i] + nums[j]) == target:
                indices.append(i)
                indices.append(j)
                return indices