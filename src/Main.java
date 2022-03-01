public class Main {
    public static void main(String[] args) {
        String[][] seatingChart = {
                {"Moiz", "Angie", "Taran", "Kelvin", "Kyler", "David", "WenHao Huang", "Nicole", "Jennifer", "Michelle",null, null},
                {"Beckett", "Raymond", "Lucy", "Apramjot", "Justin Lema", "Sam", "Tristan", "Pradeep", "Mohammad", "Haley", null, "Rely"},
                {"Cheng Han", ",Qihan", ",Kevin", ",Ryan", ",Justin Liu", ",Jeffrey", ",Danny", ",Elliot", ",Benson", ",Fiona", ",Neil", "Kaitlyn"}
        };

        int row = 0;
        for(String[] array : seatingChart)
        {
            int column = 0;
            for(String x : array)
            {
                int randRow = (int)(Math.random() * 3);
                int randColumn = (int)(Math.random() * 11);
                if(seatingChart[randRow][randColumn] == null||!(seatingChart[randRow][randColumn].equals(x))|| )//people can still get the same seats
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
    }
}
