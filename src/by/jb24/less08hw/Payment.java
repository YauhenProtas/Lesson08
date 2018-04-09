package by.jb24.less08hw;


import java.util.ArrayList;
import java.util.List;

public class Payment {

	private List<Good> pmnt = new ArrayList<Good>();

	public Payment() {
	}

	public void add(Good goods) {
		pmnt.add(goods); 
	}

	public boolean delete(Good goods) {
		return pmnt.remove(goods);
	}

	public double calcPayment() {
		double sum = 0;
		for (Good goods : pmnt) {
			sum += goods.getPrice();
		}
		return sum;
	}

	public double calcWeight() {
		double sum = 0;
		for (Good goods : pmnt) {
			sum += goods.getWeight();
		}
		return sum;
	}

	public double calcGoods() {
		return pmnt.size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pmnt == null) ? 0 : pmnt.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (pmnt == null) {
			if (other.pmnt != null)
				return false;
		} else if (!pmnt.equals(other.pmnt))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Total new goods list: " + pmnt;
	}
}