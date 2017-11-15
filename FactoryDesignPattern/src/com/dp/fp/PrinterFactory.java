package com.dp.fp;

public class PrinterFactory {
	
	public static Printer getPrinter(String printerType){
		Printer ptr = null;
		if("HP".equalsIgnoreCase(printerType))
			ptr = new HPPrinter();
		else if("XEROX".equalsIgnoreCase(printerType))
			ptr = new XeroxPrinter();
		return ptr;
		
	}

}
