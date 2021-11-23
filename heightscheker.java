class heightscheker {
    public static void main(String[] args) {
        int[] heights = { 1, 1, 3, 1, 4, 2 };
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        int[] exp = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            exp[i] = heights[i]; // making a copy of the original array
        }

        for (int i = 0; i < exp.length; i++) {
            for (int j = 1; j < exp.length - 1; j++) {
                if (exp[i] < exp[j - 1]) {
                    int temp = exp[j];
                    exp[j] = exp[j - 1];
                    exp[j - 1] = temp;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < exp.length; i++) {
            if (heights[i] != exp[i]) {
                count++;
            }
        }
        return count;
    }
}