package com.devclub.swiveldrive.utils;

import java.awt.*;

public abstract class Helper {
	/**
	 * Takes the specified dimension and returns bounds for that dimension that center
	 * the dimension on the screen.
	 * @param dimension The size of the component.
	 * @return The centered bounds for that component.
	 */
	public static Rectangle getCenteredBounds(Dimension dimension) {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screen.width - dimension.width)/2;
		int y = (screen.height - dimension.height)/2;
		Rectangle result = new Rectangle(x, y, dimension.width, dimension.height);
		return result;
	}

	/**
	 * Takes the smaller dimension and returns bounds for that dimension centered on the larger
	 * dimension
	 * @param smaller The size of the smaller dimension
	 * @param larger The dimension that the smaller dimension should be centered on
	 * @return The centered bounds for the smaller dimension
	 */
	public static Rectangle getCenteredBounds(Dimension smaller, Dimension larger) {
		int x = (larger.width - smaller.width)/2;
		int y = (larger.height - smaller.height)/2;
		Rectangle result = new Rectangle(x, y, smaller.width, smaller.height);
		return result;
	}

	public static Rectangle getCenteredBounds(int width, int height) {
		return getCenteredBounds(new Dimension(width, height));
	}

	public static String formatMoney(int money) {
		return String.format("$%,d", money);
	}

	public static String formatComma(int number) {
		return String.format("%,d", number);
	}

	public static Point[] getThreeByThreeAround(Point point, int blockSize) {
		/* 0 1 2
		 * 3 4 5
		 * 6 7 8
		 */ 
		Point[] result = new Point[9];
		int i = 0;
		for(int x = point.x - blockSize; x <= point.x + blockSize; x += blockSize) {
			for(int y = point.y - blockSize; y <= point.y + blockSize; y += blockSize) {
				result[i++] = new Point(x, y);
			}
		}
		return result;
	}
}