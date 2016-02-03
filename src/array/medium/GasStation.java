package array.medium;

/**
 * 134. Gas Station
 * Created by Ruby on 16/2/3.
 * There are N gas stations along a circular route, where the amount of gas at station i is gas[i].
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1).
 * You begin the journey with an empty tank at one of the gas stations.
 * Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.
 * Note:
 * The solution is guaranteed to be unique.
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0, start = 0;
        int remain = 0;

        for(int i = 0; i < gas.length; i ++) {
            totalCost += cost[i];
            totalGas += gas[i];
            remain = remain + gas[i] - cost[i];

            if(remain < 0) {
                start = i + 1;
                remain = 0;
            }
        }

        return totalCost <= totalGas ? start : -1;
    }
}
