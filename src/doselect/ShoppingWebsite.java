package doselect;

class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
class ItemOutOfStockException extends Exception
{
	public ItemOutOfStockException(String msg)
	{
		super(msg);
	}
}
class Customer
{
	int id;
	String name;
	double walletBalance;
	String address;
	public Customer(int id, String name, double walletBalance, String address) {
		
		this.id = id;
		this.name = name;
		this.walletBalance = walletBalance;
		this.address = address;
	}
	
}
class Item
{
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;
	public Item(int id, String name, String companyName, double price, boolean isInStock) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.isInStock = isInStock;
	}
	
}
class ShoppingException
{
	public String purchaseitem(Item i,Customer c) throws InsufficientBalanceException, ItemOutOfStockException
	{
		if(!i.isInStock)
		{
			throw new ItemOutOfStockException("item is out of stock");
		}
		else if(i.price>c.walletBalance)
		{
			throw new InsufficientBalanceException("customer wallet balance is not sufficient");
			
		}
		else
		{
			return "Order Successful";
		}
	}
}
public class ShoppingWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer(927392, "Steve", 5000, "USA");
		Item i=new Item(27392, "T-Shirt", "US polo", 800, false);
		ShoppingException obj=new ShoppingException();
		try {
			String out=obj.purchaseitem(i, c);
			System.out.println(out);
		} catch (InsufficientBalanceException | ItemOutOfStockException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
