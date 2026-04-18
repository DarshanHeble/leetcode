class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int start = 0;
            int end = image[0].length - 1;

            // Reverse +  the array
            while (start <= end) {
                int temp = image[i][start] ^ 1;
                image[i][start] = image[i][end] ^ 1;
                image[i][end] = temp;

                start++;
                end--;
            }
            // // Revert the array
            // start = 0;
            // while (start == end){
            //     if (image[i][start] == 1)
            //         image[i][start] = 0;
            //     else 
            //         image[i][start] = 1;
            // }
        }

        return image;
    }
}