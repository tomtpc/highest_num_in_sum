/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.highest_num_in_sum;

import java.util.Scanner;

/**
 * 
 * @author TomTPC < vanthanh7452 at Gmail.com >
 */
public class app {
    public static int hnis(int m){
        int ans =0;
        int sum = 0;
        for(int i = 0 ; i <= m ;i ++){
            if(sum >= m ) return ans;
            if(sum < m){
                sum += i;
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N:");int n = Integer.parseInt(sc.nextLine());
        System.out.println(hnis(n));
    }
}
