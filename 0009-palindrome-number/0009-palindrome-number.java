class Solution {
    public boolean isPalindrome(int x) {
     
    
    if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
    }
    int[] digits = new int[20];
int len = 0;
    int temp = x;
    while (temp != 0) {
        digits[len++] = temp % 10;
        temp /= 10;
    }
    
    int left = 0, right = len - 1;
    while (left < right) {
        if (digits[left++] != digits[right--]) {
            return false;
        }
    }
    return true;
}
 
    }