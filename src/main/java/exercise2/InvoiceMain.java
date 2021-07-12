package exercise2;

import java.util.Arrays;
import java.util.List;

public class InvoiceMain {

	public static void main(String[] args) {
		Invoice[] invoices = {
                new Invoice("83", "Electric sander", 7, 57.98),
                new Invoice("24", "Power saw", 18, 99.99),
                new Invoice("7", "Sledge hammer", 11, 21.50),
                new Invoice("77", "Hammer", 76, 11.99),
                new Invoice("39", "Lawn mower", 3, 79.50),
                new Invoice("68", "Screwdriver", 106, 6.99),
                new Invoice("56", "Jig saw", 21, 11.00),
                new Invoice("3", "Wrench", 34, 7.50)
        };
		
		List<Invoice> invoiceList = Arrays.asList(invoices);
		invoiceList.stream()
					.sorted((i1, i2) -> i1.getDescription().compareTo(i2.getDescription()))
					.forEach(i -> System.out.println(i.toString()));

		System.out.println();
		
		invoiceList.stream()
					.sorted( (i1, i2) -> Double.compare(i1.getPricePerItem(), i2.getPricePerItem()))
					.forEach(i -> System.out.println(i.toString()));
		
		System.out.println();
		
	}

}
