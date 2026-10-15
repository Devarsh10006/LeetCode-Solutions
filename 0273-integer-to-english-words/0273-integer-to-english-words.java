class Solution {
    public String numberToWords(int num) {

        if (num == 0) return "Zero";
        
        int i = 0;
        String result = "";

        while (num > 0) {
            if (num % 1000 != 0) {
                result = helper(num % 1000) + thousands[i] + " " + result;
            }
            num /= 1000;
            i++;
        }

        return result.trim();
    }

    private final String[] belowTen = {
        "", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine"
    };

    private final String[] belowTwenty = {
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private final String[] thousands = {
        "", "Thousand", "Million", "Billion"
    };

    private String helper(int num) {
        if (num == 0)
            return "";
        else if (num < 10)
            return belowTen[num] + " ";
        else if (num < 20)
            return belowTwenty[num - 10] + " ";
        else if (num < 100)
            return tens[num / 10] + " " + helper(num % 10);
        else
            return belowTen[num / 100] + " Hundred " + helper(num % 100);
    }
}
