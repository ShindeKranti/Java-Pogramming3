public class RemoveDigitMax {
    public static void main(String[] args) {

        String number = "1321";   
	char digit = '1';
        int removePos = -1;
 
        //  Find the best position to remove
        for (int i = 0; i < number.length() - 1; i++) {
            if (number.charAt(i) == digit && number.charAt(i + 1) > digit) {
                removePos = i;
                break;
            }
        }

        // If no position found, remove last occurrence
        if (removePos == -1) {
            removePos = number.lastIndexOf(digit);
        }

        //  Print the final result
        for (int i = 0; i < number.length(); i++) {
            if (i != removePos) {
                System.out.print(number.charAt(i));
            }
        }
    }
}
