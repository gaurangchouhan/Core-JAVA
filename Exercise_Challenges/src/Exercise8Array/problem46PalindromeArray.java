package Exercise8Array;

public class problem46PalindromeArray {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        boolean isPalindrome = isPalindrome(numArr);

        if (isPalindrome){
            System.out.println("User array is Palindrome Array");
        }else  {
            System.out.println("User array is NOT Palindrome Array");
        }
    }

    public static boolean isPalindrome(int[] numArr){
        int i = 0;
        while (i < numArr.length){
            if (numArr[i] != numArr[(numArr.length-1) - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
