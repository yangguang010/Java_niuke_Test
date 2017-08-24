package com.yangguang.test1;

import java.util.*;


/*
  					数串
 题目描述
设有n个正整数，将他们连接成一排，组成一个最大的多位整数。
如:n=3时，3个整数13,312,343,连成的最大整数为34331213。
如:n=4时,4个整数7,13,4,246连接成的最大整数为7424613。
输入描述:
有多组测试样例，每组测试样例包含两行，第一行为一个整数N（N<=100），第二行包含N个数(每个数不超过1000，空格分开)。
输出描述:
每组数据输出一个表示最大的整数。
示例1
输入

2
12 123
4
7 13 4 246
输出

12312
7424613

 */

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            List<String> list = new ArrayList<>();
            for(int i = 0;i<n;i++){
                list.add(sc.next());
            }
   
            Collections.sort(list, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					int len1 = o1.length();
					int len2 = o2.length();
					
					for(int i = 0; i<len1&&i<len2;i++) {
						if(o1.charAt(i) < o2.charAt(i)) 
							return 1;
						else if(o1.charAt(i) > o2.charAt(i)) 
							return -1;
					}
					if (len1 < len2) {
						return compare(o1, o2.substring(len1));
					} else if (len1 > len2) {
						return compare(o1.substring(len2), o2);
					}
					return 0;
				}
            	
            });
            
            StringBuffer sBuffer = new StringBuffer();
            for(String s:list){
            	sBuffer.append(s);
            }
            
            System.out.print(sBuffer.toString());
        }
    }
}
