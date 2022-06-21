public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                int current = Integer.parseInt(number.trim());
                if(current < 0){
                    throw new IndexOutOfBoundsException("negatives not allowed");
                }
                if(current > 999){
                    continue;
                }
                if (!number.trim().isEmpty()) {
                    returnValue += current; // If it is not a number, parseInt will throw an exception
                }
            }
        }
        return returnValue;

    }
}
