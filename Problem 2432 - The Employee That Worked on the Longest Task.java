class Solution {
    public int hardestWorker(int totalTasks, int[][] logs) {
        int hardestWorkerId = -1;
        int longestTaskDuration = 0;
        int currentTaskStart = 0;
        for (int[] taskLog : logs) {
            int taskDuration = taskLog[1] - currentTaskStart;

            if (taskDuration > longestTaskDuration ||
                    (taskDuration == longestTaskDuration && hardestWorkerId > taskLog[0])) {
                hardestWorkerId = taskLog[0];
                longestTaskDuration = taskDuration;
            }
            currentTaskStart = taskLog[1];
        }

        return hardestWorkerId;
    }
}
