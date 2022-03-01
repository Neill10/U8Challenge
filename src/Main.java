public class Main {
    public static void main(String[] args) {
        String[][] seatingChart = {
                {"Moiz", "Angie", "Taran", "Kelvin", "Kyler", "David", "WenHao Huang", "Nicole", "Jennifer", "Michelle",null, null},
                {"Beckett", "Raymond", "Lucy", "Apramjot", "Justin Lema", "Sam", "Tristan", "Pradeep", "Mohammad", "Haley", null, "Rely"},
                {"Cheng Han", "Qihan", "Kevin", "Ryan", "Justin Liu", "Jeffrey", "Danny", "Elliot", "Benson", "Fiona", "Neil", "Kaitlyn"}
        };

        int[][] seatNum = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22},
                {23, 24, 25, 26, 27, 28, 29 ,30, 31, 32, 33, 34}};
        /*
        int row = 0;
        for(int[] array : seatNum)
        {
            int column = 0;
            for (int x : array)
            {
                int randRow = (int)(Math.random() * 3);
                int randColumn = (int)(Math.random() * 11);
                if(seatNum[randRow][randColumn] != 9 && seatNum[randRow][randColumn] != 10 && seatNum[randRow][randColumn] != 21)//people can still get the same seats
                {
                    int temp = seatNum[randRow][randColumn];
                    seatNum[randRow][randColumn] = x;
                    seatNum[row][column] = temp;
                }
                column++;
            }
        }

        */

        int row = 0;
        for(String[] array : seatingChart)
        {
            int column = 0;
            for(String x : array)
            {
                int randRow = (int)(Math.random() * 3);
                int randColumn = (int)(Math.random() * 11);
                if(seatingChart[randRow][randColumn] == null||!(seatingChart[randRow][randColumn].equals(x)))//people can still get the same seats
                {
                    String temp = seatingChart[randRow][randColumn];
                    seatingChart[randRow][randColumn] = x;
                    seatingChart[row][column] = temp;
                }
                column++;
            }
            row++;
        }

        for(String[] i : seatingChart)
        {
            for(String x : i)
            {
                System.out.println(x);
            }
        }

        System.out.println(allRandNames(seatingChart));

    }

    static private boolean allRandNames(String[][] seatingChart)
    {
        String[][] seatingChart2 = {
                {"Moiz", "Angie", "Taran", "Kelvin", "Kyler", "David", "WenHao Huang", "Nicole", "Jennifer", "Michelle",null, null},
                {"Beckett", "Raymond", "Lucy", "Apramjot", "Justin Lema", "Sam", "Tristan", "Pradeep", "Mohammad", "Haley", null, "Rely"},
                {"Cheng Han", "Qihan", "Kevin", "Ryan", "Justin Liu", "Jeffrey", "Danny", "Elliot", "Benson", "Fiona", "Neil", "Kaitlyn"}
        };
        int row = 0;
        for(String[] array : seatingChart2)
        {
            int column = 0;
            for(String x : array)
            {
                if(x != null && x.equals(seatingChart[row][column]))
                {
                    return false;
                }
                column++;
            }
            row++;
        }
        return true;
    }
    private boolean allRand(int[][] seatNum)
    {
        int[][] seatNum2 = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22},
                {23, 24, 25, 26, 27, 28, 29 ,30, 31, 32, 33, 34}};
        int row = 0;
        for(int[] i : seatNum)
        {
            int column = 0;
            for(int x : i)
            {
                if(x != 9 && x != 10 && x != 21 && x == seatNum[row][column])
                {
                    return true;
                }
                row++;
            }
            row++;
        }
        return false;
    }

}

