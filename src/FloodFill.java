public class FloodFill {
   static int[][] moves = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

    public static void main(String[] args) {
        int[][] image = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        floodFill(image, 1,1,2);
        for(int i=0; i<image.length;i++){
            for(int j =0; j < image[i].length; j++){
                System.out.println(image[i][j]);
            }
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int prevColor = image[sr][sc];
        if(newColor == prevColor) return image;
        dfs( image, sr, sc, newColor, prevColor);
        return image;
    }

    public static void dfs(int[][] image, int sr, int sc, int newColor, int prevColor){
        if(sr < 0 || sc < 0 || sr == image.length || sc == image[sr].length|| image[sr][sc] != prevColor ) return;
            image[sr][sc] = newColor;
            for(int[] m : moves){
                dfs(image, sr+m[0], sc+m[1], newColor, prevColor);
            }

        return;
    }
}
