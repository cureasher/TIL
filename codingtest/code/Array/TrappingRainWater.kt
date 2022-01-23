fun trap(height : IntArray) : Int{
    var capacity = 0
    var left = 0
    var right = height.size - 1
    var leftMax = 0
    var rightMax = 0

    while (left < right){
        leftMax = max(height[left], leftMax)
        rightMax = max(height[right], rightMax)

        if (leftMax <= rightMax){
            capacity += leftMax - height[left]
            ++left
        } else {
            capacity += rightMax - height[right]
            --right
        }
    }

    return capacity
}