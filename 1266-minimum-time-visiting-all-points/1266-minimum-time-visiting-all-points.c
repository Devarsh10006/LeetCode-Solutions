int minTimeToVisitAllPoints(int** points, int pointsSize, int* pointsColSize) {
    int totalTime = 0;

    for(int i = 1; i < pointsSize; i++)
    {
        int dx = abs(points[i][0] - points[i - 1][0]);
        int dy = abs(points[i][1] - points[i - 1][1]);

        totalTime += dx > dy ? dx : dy; 
    }

    return totalTime;
}