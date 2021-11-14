package com.company;

public class Main {

    public static void main(String[] args) {
        double[] byti ={-1.2,  2.4, -23.234, 234.23, -74.6, 5.4, 321.2, -512.21, 78.74, 652.231, -102.11, 983.43, -737.02, 803.23, 6.12};
        double kun = 0;
        int hooly = 0;
        boolean skill = false;
        for ( double letsDoIt: byti){
            if (letsDoIt < 0 ) {
                skill = true;
            }else {
                if (skill){
                    hooly++;
                    kun += letsDoIt;
                }
                }
            }
        System.out.println("Среднее арифетичесоке " + kun/hooly);
         }
}
