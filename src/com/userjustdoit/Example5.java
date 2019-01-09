package com.userjustdoit;

import java.awt.Color;

import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;

/**
 *测试latex转png
 */
public class Example5 {
	
	   public static void main(String[] args) {

	        /*String latex = "\\begin{array}{|c|l|||r|c|}";
	        latex += "\\hline";
	        latex += "\\text{Matrix}&\\multicolumn{2}{|c|}{\\text{Multicolumns}}&\\text{Font sizes commands}\\cr";
	        latex += "\\hline";
	        latex += "\\begin{pmatrix}\\alpha_{11}&\\cdots&\\alpha_{1n}\\cr\\hdotsfor{3}\\cr\\alpha_{n1}&\\cdots&\\alpha_{nn}\\end{pmatrix}&\\Large \\text{Large Right}&\\small \\text{small Left}&\\tiny \\text{tiny Tiny}\\cr";
	        latex += "\\hline";
	        latex += "\\multicolumn{4}{|c|}{\\Huge \\text{Huge Multicolumns}}\\cr";
	        latex += "\\hline";
	        latex += "\\end{array}";*/

		   String latex1 ="\\frac{1}{1+sin(x)}";
		   String latex2 ="\\frac{1}{1+sin(x)+\\frac{1}{1+sin(x)+\\frac{1}{1+sin(x)+\\frac{1}{1+sin(x)}}}}";
	       TeXFormula formula = new TeXFormula(latex1);
	       formula.createPNG(TeXConstants.STYLE_DISPLAY, 20, "target/Example1.png", Color.white, Color.black);
	       
	       TeXFormula formula2 = new TeXFormula(latex2);
	       formula2.createPNG(TeXConstants.STYLE_DISPLAY, 20, "target/Example4.png", Color.white, Color.black);
	       
	    }
}
