public class testing {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3,4,5},
                {2,3,4,5,6},
                {3,4,5,6,7},
                {4,5,6,7,8},
                {7,3,4,5,6},


        };
        System.out.println(duplicates(array));
    }
    static private boolean duplicates(int[][] array)
    {
        for(int i = 0; i <  array[0].length;i++)
        {
            int row = 0;
            for(int x = 1; x < array.length;x++)//might need -1
            {
                for(int a = row + 1; a < array.length; a++) {
                    System.out.println(i + " " + a);
                    if(array[row][i] == array[a][i]) {
                        return true;
                    }
                }
                System.out.println();
                if (array[row][i] != array[x][i]) {
                    row++;
                }

            }
            System.out.println();
        }
        return false;
    }
}
