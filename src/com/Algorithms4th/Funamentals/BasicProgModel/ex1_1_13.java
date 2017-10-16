package com.Algorithms4th.Funamentals.BasicProgModel;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 二维数组的转置
 * @author 10169
 *
 */
public class ex1_1_13 {
	
	
//	二维数组转置的方法
	private static int[][] revrse(int[][] a){
		int[][] b = new int[a[0].length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				b[i][j]	=a[j][i];
				
			}
		}
		return b;
		
	}
//交换
	private static void exch(int i,int j){
		int temp =i;
		i = j;
		j = temp;
		
	}
	//打印数组
	public static void printArray(int[][] c){
		System.out.println("打印结果如下：");
		for(int i=0;i<c.length;i++){
		for(int j=0;j<c[i].length;j++){
		System.out.print(c[i][j]+"\t");
		}
		System.out.println();
		}
	}
	
	public static void main(String[] args) {
		 StdOut.println("请输入需要转置的行号列号");
		 int M =StdIn.readInt();
		 int N =StdIn.readInt();
		 int[][] a= new int[M][N];
		 for (int i = 0; i < M; i++) {
			 for (int j = 0; j < N; j++) {
				 a[i][j]=(int) (StdRandom.random()*100);
				
			}
			
		}
		int[][] c= revrse(a);
		 //打印数组
		 printArray(a);
		 printArray(c);
		 
	}

}
