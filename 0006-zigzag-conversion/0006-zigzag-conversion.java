class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) { return s; }

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++)
            rows[i] = new StringBuilder();

        int curRow = 0;
        boolean goDown =  true;

        for(char ch : s.toCharArray())
        {
            rows[curRow].append(ch);

            if (curRow == 0)
                goDown = true;
            else if (curRow == numRows - 1)
                goDown = false;

            curRow += goDown ? 1 : -1;
        }

        StringBuilder ans = new StringBuilder();

        for (StringBuilder row : rows)
            ans.append(row);

        return ans.toString();
    }
}