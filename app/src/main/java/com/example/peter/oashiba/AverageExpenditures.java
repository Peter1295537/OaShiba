package com.example.peter.oashiba;

/**
 * Created by peter on 9/17/17.
 */

public class AverageExpenditures {
    public static double averBiweek(double balanceStart, double balanceEnd, int days) {
        double average=(balanceStart-balanceEnd)/days;
        return average;
    }
    public static double biweeklyExp(double balanceStart, double balanceEnd) {
        double expend=balanceStart-balanceEnd;
        return expend;
    }
    //percentLimit should always be less than one
    public static double maxExpend(double balanceStart, double percentLimit) {
        if (percentLimit>1.0){
            return -1;
        }
        double max=balanceStart*percentLimit;
        return max;
    }

    public static double percentSpent(double balanceStart, double expend) {
        double percent=expend/balanceStart;
        return percent;
    }

    /*public int daysSincePay(int startday, int currentday){
        if(startday>currentday) {

        }
    }
    */



}
