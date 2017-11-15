package com.dp.fp;

public class PrintingMachine {
	
	public static void main(String[] args){
		Printer ptr = PrinterFactory.getPrinter("XEROX");
		ptr.print();
	}

}
