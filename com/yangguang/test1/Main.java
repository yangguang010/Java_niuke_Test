package com.yangguang.test1;

import java.util.*;


/*
  					����
 ��Ŀ����
����n�������������������ӳ�һ�ţ����һ�����Ķ�λ������
��:n=3ʱ��3������13,312,343,���ɵ��������Ϊ34331213��
��:n=4ʱ,4������7,13,4,246���ӳɵ��������Ϊ7424613��
��������:
�ж������������ÿ����������������У���һ��Ϊһ������N��N<=100�����ڶ��а���N����(ÿ����������1000���ո�ֿ�)��
�������:
ÿ���������һ����ʾ����������
ʾ��1
����

2
12 123
4
7 13 4 246
���

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
