package ru.knbase.java1.lec4;

import java.util.Arrays;

public class Matrix {

	public final int height;
	public final int width;
	final double[][] matrix;

	public Matrix(int height, int width) {
		this.height = height;
		this.width = width;
		matrix = new double[width][height];
	}

	public Matrix setValue(int x, int y, double value) {
		matrix[x][y] = value;
		return this;
	}

	public Matrix add(Matrix m) {
		Matrix a = this;
		Matrix b = m;
		
		
		if (height != m.height || width != m.width)
			return null;
		Matrix result = new Matrix(height, width);
		
		for (int x = 0; x < width; x++) {
			
			for (int y = 0; y < height; y++) {
				result.setValue(x, y, a.matrix[x][y] + b.matrix[x][y]);
			}
			
		}
		return result;
	}

	@Override
	public String toString() {
		return Arrays.deepToString(matrix).replaceAll("\\], \\[", "]\n[").substring(1).replaceAll("\\]\\]", "]");
	}

}
