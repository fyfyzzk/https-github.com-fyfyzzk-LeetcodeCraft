public class Solution {
    public int addDigits(int num) {
        int ret = 0;
        
        //  calculate how many digits 
        while (true) {
            if (num == 0) {
                if (ret < 10) {
                    break;
                }
                else {
                    num = ret;
                    ret = 0;
                }
            }
            
            ret += num % 10;
            num /= 10;
        }
        
        return ret;
    }
}