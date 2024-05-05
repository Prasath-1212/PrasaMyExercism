class PrimeCalculator {

    int nth(int nth) {
        if (nth <= 0) {
            throw new IllegalArgumentException("Value of nth must be greater than 0.");
        }

        int count = 0;
        int num = 2; // Start from the first prime number

        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == nth) {
                    return num;
                }
            }
            num++;
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
