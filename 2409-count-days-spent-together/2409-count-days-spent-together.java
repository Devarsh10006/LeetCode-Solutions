class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        int aA = getDay(arriveAlice),
            lA = getDay(leaveAlice),
            aB = getDay(arriveBob),
            lB = getDay(leaveBob)
        ;

        int start = Math.max(aA, aB),
            end   = Math.min(lA, lB)
        ;

        return Math.max(0, end - start + 1);
    }

    private int getDay(String date) {

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int month = Integer.parseInt(
            date.substring(0, 2)
        );
        int day = Integer.parseInt(
            date.substring(3, 5)
        );

        for (int i = 0; i < month - 1; i++) 
        {
            day += days[i];
        }

        return day;
    }
}