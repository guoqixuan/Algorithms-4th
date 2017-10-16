package com.Algorithms4th.Funamentals.BasicProgModel;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ex1_1_09 {
	public static void main(String[] args) {
		StdOut.println("请输入需要转换为二进制的十进制数");
		int N = StdIn.readInt();
		String sum = Integer.toBinaryString(N);
		String s="";
		for (int i = N; i > 0; i/=2) {
			s = (i%2)+s;
		}
		StdOut.print(s);
	}

}
