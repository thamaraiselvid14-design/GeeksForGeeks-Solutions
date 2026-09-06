class Solution {
    public int findMin(int a, int b) {
        int min = Math.min(a + b, Math.min(a - b, a * b));

        try {
            int div = Math.floorDiv(a, b);
            min = Math.min(min, div);
        } catch (ArithmeticException e) {
            
        }

        return min;
    }
}

