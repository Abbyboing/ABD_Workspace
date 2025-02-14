package com.Language_Fundamentals;

public class Arrays {
	public static void main(String[] args) {

		/* Array Declaration */
//		int[6] x; //Cannot define value while declaring array
		int[] x;
		int[][] y;
		int[][] a, b;
//		int[]   []c,[]d; //[]c Only applicable to 1st variable not to following variables
		int[][] e, f[];

		/* Array Creation */
		int[] g = new int[3];
		System.out.println("One Dimension Array : " + g.getClass().getName());
		int[][] h = new int[3][2];
		System.out.println("Two Dimension Array : " + h.getClass().getName());

		byte[] i = new byte[2];
		System.out.println("Byte Array : " + i.getClass().getName());
		short[] j = new short[2];
		System.out.println("Short Array : " + j.getClass().getName());
		int[] o = new int[2];
		System.out.println("Short Array : " + o.getClass().getName());
		long[] k = new long[2];
		System.out.println("Long Array : " + k.getClass().getName());
		float[] l = new float[2];
		System.out.println("Float Array : " + l.getClass().getName());
		double[] d = new double[4];
		System.out.println("Double Array : " + d.getClass().getName());
		boolean[] m = new boolean[5];
		System.out.println("Boolean Array : " + m.getClass().getName());
		char[] n = new char[2];
		System.out.println("Char Array : " + n.getClass().getName());
		
//		int[] p = new int[]; //Compulsary to define the size at array creation
		int[] p = new int[0];
		
		System.out.println(args.getClass().getName());
		System.out.println(args.length);
		for (int p2 = 0; p2 < args.length; p2++) {
			System.out.println(args[p2]);
		}
		
		byte r = 0b00000000000000000000000000101111;
//		byte r = 0b11111111111111111111111111010001;
		int[] q = new int[r];
		System.out.println(q.getClass().getName());
		System.out.println(q.length);

	}
}
