package com.kata.formatters;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class AmountFormatter {

	private static DecimalFormat decimalFormat = new DecimalFormat("+.##;-.##");
	
	public static String amountOf(double amount)
	{
		decimalFormat.setRoundingMode(RoundingMode.DOWN);
		decimalFormat.setMinimumFractionDigits(2);
		//decimalFormat.
		return decimalFormat.format(amount);
	}
	
}
