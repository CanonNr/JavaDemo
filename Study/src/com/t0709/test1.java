package com.t0709;

import java.util.Scanner;

public class test1
{
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // 实例化一个分数的数组  长度为6
        int[] arr = new int[6];
        // 输入分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("请输入第"+(i+1)+"位评委的分数：");
            int score = sc.nextInt();
            arr[i] = score;
        }
        //去掉一个最高分
        int maxScore = getMaxScore(arr);
        int minScore = getMinScore(arr);
        //所有分数求和
        int sumScores = getScoreSum(arr);
        //去掉一个最高分一个最低分
        sumScores = sumScores - maxScore - minScore;
        //求平均数
        int result = sumScores/(arr.length-2);
        System.out.println("最终得分:"+result);
    }

    public static int getScoreSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getMaxScore(int[] arr){
        int maxscore = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxscore){
                maxscore = arr[i];
            }
        }
        return maxscore;
    }

    public static int getMinScore(int[] arr){
        int minscore = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minscore){
                minscore = arr[i];
            }
        }
        return minscore;
    }
}
