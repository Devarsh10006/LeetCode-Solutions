class Solution {
    public int bestClosingTime(String customers) {

        // int n = customers.length();
        // int bestHour = 0;
        // int minPenalty = Integer.MAX_VALUE; //Sauthi moto integer lai levano etle g malse e nanu j malse and last vali condition ma jai sake

        // // ekko ek hours maate check karsu
        // for (int i = 0; i <= n; i++) {

        //     int penalty = 0;

        //     // open hoy tyare n mate penalty lage
        //     for (int j = 0; j < i; j++) {
        //         if (customers.charAt(j) == 'N') {
        //             penalty++;
        //         }
        //     }

        //     // close karya pachhi y mate penalty laagse
        //     for (int j = i; j < n; j++) {
        //         if (customers.charAt(j) == 'Y') {
        //             penalty++;
        //         }
        //     }

        //     // update answer karyo and minimum hour set karyo
        //     if (penalty < minPenalty) {
        //         minPenalty = penalty;
        //         bestHour = i;
        //     }
        // }

        // return bestHour;


        int len = customers.length();
        int penalty = 0;

        for (int i = 0; i < len; i++) {
            if (customers.charAt(i) == 'Y') { penalty++; }
        }

        int minPenalty = penalty;
        int bestHour = 0;

        for (int i = 0; i < len; i++) {

            if (customers.charAt(i) == 'Y') { penalty--; }
            else { penalty++; }

            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestHour = i + 1;
            }
        }

        return bestHour;
    }
}