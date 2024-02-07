
# LeetCode Challenge D47

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [2432. The Employee That Worked on the Longest Task](https://leetcode.com/problems/the-employee-that-worked-on-the-longest-task/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
There are  `n`  employees, each with a unique id from  `0`  to  `n - 1`.

You are given a 2D integer array  `logs`  where  `logs[i] = [idi, leaveTimei]`  where:

-   `idi`  is the id of the employee that worked on the  `ith`  task, and
-   `leaveTimei`  is the time at which the employee finished the  `ith`  task. All the values  `leaveTimei`  are  **unique**.

Note that the  `ith`  task starts the moment right after the  `(i - 1)th`  task ends, and the  `0th`  task starts at time  `0`.

Return  _the id of the employee that worked the task with the longest time._  If there is a tie between two or more employees, return _the  **smallest**  id among them_.

**Example**
>**Input:** n = 10, logs = [[0,3],[2,5],[0,9],[1,15]]
>
>**Output:** 1
>
>**Explanation:** 
Task 0 started at 0 and ended at 3 with 3 units of times.
Task 1 started at 3 and ended at 5 with 2 units of times.
Task 2 started at 5 and ended at 9 with 4 units of times.
Task 3 started at 9 and ended at 15 with 6 units of times.
The task with the longest time is task 3 and the employee with id 1 is the one that worked on it, so we return 1.

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview
In the `hardestWorker` method, the function aims to determine the ID of the worker who executed the longest task. It begins by initializing variables to track the ID of the hardest worker (`hardestWorkerId`), the duration of the longest task (`longestTaskDuration`), and the start time of the current task (`currentTaskStart`). It then iterates through each task log provided in the `logs` array. For each log, it computes the duration of the task and compares it with the longest task duration seen thus far. If the current task surpasses the longest task duration or has the same duration but a lower worker ID, the function updates the `hardestWorkerId` and `longestTaskDuration` accordingly. Ultimately, the function returns the ID of the hardest worker identified based on the provided logs. This systematic approach ensures accurate identification of the worker who executed the longest task.
