给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。
如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则
反转前 k 个字符，并将剩余的字符保持原样。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-string-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        int len=s.length();
       for (int i = 0; i < s.length(); i = i + 2 * k){
            if(i+k-1<=len-1){
                int l=i;
                int r=i+k-1;
                while(l<r){
                char tmp=arr[l];
                arr[l++]=arr[r];
                arr[r--]=tmp;
                }
            }else{
                int l=i;
                int r=len-1;
                 while(l<r){
                char tmp=arr[l];
                arr[l++]=arr[r];
                arr[r--]=tmp;
                }
            } 
        }
        return new String(arr);
    }
}

