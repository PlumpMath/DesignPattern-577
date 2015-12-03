package template;

public abstract class PizzaFactory {

	/**
	 * ����������
	 */
	public void makeDough() {
		System.out.println("Make dough");
	}
	
	/**
	 * ��ӵ���
	 */
	public void addSauce() {
		System.out.println("Add Sauce");
	}
	
	public void addCheese() {
		System.out.println("Add Cheese");
	}
	
	public abstract void addTopping();
	
	
	
	public void makePizza() {
		makeDough();
		addSauce();
		addCheese();
		addTopping();
	}
	
	
}
