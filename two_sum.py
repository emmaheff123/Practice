def twoSum(nums, target):
    n = len(nums)
    indices = []
    for i in range(0, n):
        for j in range(1, n):
            if (nums[i] + nums[j]) == target:
                indices.append(i)
                indices.append(j)
                return indices
            

def twoSum(nums, target):
    num_map = {} 
    for i, num in enumerate(nums):
        complement = target - num
        if complement in num_map:
            return [num_map[complement], i]  
        num_map[num] = i