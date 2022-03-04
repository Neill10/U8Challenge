public class Main {
    public static void main(String[] args) {
        String[][] seatingChart = {
                {"Moiz", "Angie", "Taran", "Kelvin", "Kyler", "David", "WenHao Huang", "Nicole", "Jennifer", "Michelle"},
                {"Beckett", "Raymond", "Lucy", "Apramjot", "Justin Lema", "Sam", "Tristan", "Pradeep", "Mohammad", "Haley","N/A", "Rely"},
                {"ChengHan", "Qihan", "Kevin", "Ryan", "Justin", "Jeffrey", "Danny", "Elliot", "Benson", "Fiona", "Neil", "Kaitlyn"}
        };

        while(newNeighbor(seatingChart) == false) {
            while (allRandNames(seatingChart) == false) {
                int row = 0;
                for (String[] array : seatingChart) {
                    int column = 0;
                    for (String x : array) {
                        if (row != 0 && column != 10 || row != 0 && column != 11) {
                            int randRow = (int) (Math.random() * 3);
                            int randColumn = (int) (Math.random() * 12);
                            while (randRow == 0 && randColumn == 10 || randColumn == 11) {
                                randRow = (int) (Math.random() * 3);
                                randColumn = (int) (Math.random() * 12);
                            }
                            if ((seatingChart[randRow][randColumn] != null) && !(seatingChart[randRow][randColumn].equals(x))) {
                                String temp = seatingChart[randRow][randColumn];
                                seatingChart[randRow][randColumn] = x;
                                seatingChart[row][column] = temp;
                            }
                        }
                        column++;
                    }
                    row++;
                }
            }
        }

        for(String[] i : seatingChart)
        {
            for(String x : i)
            {
                System.out.print(x + " ");
            }
            System.out.println("");
        }
        System.out.println(allRandNames(seatingChart));

    }

    static private boolean newNeighbor(String[][] seatingChart)
    {
        String[][] seatingChart2 = {
                {"Moiz", "Angie", "Taran", "Kelvin", "Kyler", "David", "WenHao Huang", "Nicole", "Jennifer", "Michelle"},
                {"Beckett", "Raymond", "Lucy", "Apramjot", "Justin Lema", "Sam", "Tristan", "Pradeep", "Mohammad", "Haley", "N/A", "Rely"},
                {"ChengHan", "Qihan", "Kevin", "Ryan", "Justin", "Jeffrey", "Danny", "Elliot", "Benson", "Fiona", "Neil", "Kaitlyn"}
        };

        for(int i = 0; i < seatingChart.length;i++)//3 rows
        {
            for(int x = 1; x < seatingChart[0].length - 1;x++)//starts at Angie,Raymond,Qihan
            {
                String previous = seatingChart[i][x-1];
                String after = seatingChart[i][x+1];
                if (previous != null && after != null && seatingChart[i][x] != null) {//prevents null values
                    for (int a = 0; a < seatingChart.length; a++)//3 rows
                    {
                        for (int b = 1; b < seatingChart[0].length - 1; b++) {
                            if (a == i && x == b) {
                                String previous2 = seatingChart2[a][b - 1];
                                String after2 = seatingChart2[a][b + 1];
                                if (previous.equals(previous2) || after.equals(after2)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }



    static private boolean allRandNames(String[][] seatingChart)
    {
        String[][] seatingChart2 = {
                {"Moiz", "Angie", "Taran", "Kelvin", "Kyler", "David", "WenHao Huang", "Nicole", "Jennifer", "Michelle",null, null},
                {"Beckett", "Raymond", "Lucy", "Apramjot", "Justin Lema", "Sam", "Tristan", "Pradeep", "Mohammad", "Haley", "N/A", "Rely"},
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

