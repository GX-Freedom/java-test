class Account {
	public static void print() {
		System.out.println("Class Method test");
	}
	
}

public class AccountingApp {
	
	
	public static void main(String[] args) {
	
		double money = 10000;
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double[] diviedendRate;
		double vat = money * vatRate;
		double total = money + vat;
		double expense = money * expenseRate;
		double income = money - expense;
		
		if(income > 10000)
		{
			diviedendRate = new double[] {0.5, 0.3, 0.2};
		}
		else {
			diviedendRate = new double[] {1};
		}
		
		System.out.println("Value of Supply : " + money);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("income : " + income);
	
		
		for(var i = 0; i < diviedendRate.length; i++)
		{
			System.out.println("Diviedend"+ (i+1) + " : " + income * diviedendRate[i] );
		}
		
		Account.print();
		

	}
	

}
