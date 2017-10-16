package com.Algorithms4th.Funamentals.BasicProgModel;

import edu.princeton.cs.algs4.StdOut;
/**
 * 斐波拉契数列的实现
 * @author 10169
 *
 */
public class ex1_1_06 {
	public static void main(String[] args) {
		int f = 0;
		int g = 1;
		for(int i =0;i<=15;i++){
			StdOut.println(f);
			f = f+g;
			g = f-g;
		}
	}

}
