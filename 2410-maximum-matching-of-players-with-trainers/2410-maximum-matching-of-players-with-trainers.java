class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        
        int m = players.length;
        int n = trainers.length;
        
        Arrays.sort(players);
        Arrays.sort(trainers);

        int i = 0;
        for(int j = 0; j < n && i < m; j++)
        {
            if(trainers[j] >= players[i]) i++;
        }

        return i;
    }
}