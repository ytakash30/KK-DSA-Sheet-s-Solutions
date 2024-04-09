class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // Iterate through each row of the image array
        for (int i = 0; i < image.length; i++) {
            int j = 0, k = image[i].length - 1; // Initialize pointers for flipping
            // Flip and invert elements until j <= k
            while (j <= k) {
                int tmp = image[i][j]; // Store element at index j
                // Invert and swap elements at indices j and k
                image[i][j] = image[i][k] ^ 1;
                image[i][k] = tmp ^ 1;
                j++; // Move j towards center
                k--; // Move k towards center
            }
        }
        return image; // Return the modified image array
    }
}