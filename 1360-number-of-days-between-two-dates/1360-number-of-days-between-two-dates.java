class Solution {
    public int daysBetweenDates(String date1, String date2) {
        
        String[] a = date1.split("-");
        String[] b = date2.split("-");

        int y1 = Integer.parseInt(a[0]);
        int m1 = Integer.parseInt(a[1]);
        int d1 = Integer.parseInt(a[2]);

        int y2 = Integer.parseInt(b[0]);
        int m2 = Integer.parseInt(b[1]);
        int d2 = Integer.parseInt(b[2]);

        return Math.abs(count(y1, m1, d1) - count(y2, m2, d2));
    }

    private int count(int y, int m, int d) {

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        int total = 0;

        for(int i = 0; i < y; i++)
        {
            total += 365;
            if (i % 400 == 0 || 
               (i % 4 == 0 && i % 100 != 0))
            {
                total++;
            }
        }

        if (y % 400 == 0 || 
           (y % 4 == 0 && y % 100 != 0)) 
        {
            days[1] = 29;
        }

        for (int i = 0; i < m - 1; i++) { total += days[i]; }

        return total + d;
    }
}