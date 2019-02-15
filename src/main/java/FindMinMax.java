class MinMaxResult{
    int min;
    int max;

    public MinMaxResult() {
    }

    public MinMaxResult(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinMaxResult that = (MinMaxResult) o;
        return min == that.min &&
                max == that.max;
    }

    @Override
    public String toString() {
        return String.format("MinMaxResult{min=%d, max=%d}", min, max);
    }
}

public class FindMinMax {

    public static MinMaxResult eval(String[] numbers) {
        validateInputNumbers(numbers);
        int[] intNumbers = convertToNumbers(numbers);

        MinMaxResult result = new MinMaxResult();
        result.min = result.max = intNumbers[0];
        for (int i = 1; i < intNumbers.length; i++) {
            result.min = Math.min(result.min, intNumbers[i]);
            result.max = Math.max(result.max, intNumbers[i]);
        }

        return result;
    }

    private static void validateInputNumbers(String[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("List can not be empty");
        }
    }

    private static int[] convertToNumbers(String[] numbersStr) {
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }
        return numbers;
    }
}
