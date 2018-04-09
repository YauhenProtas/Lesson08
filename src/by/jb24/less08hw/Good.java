package by.jb24.less08hw;

public class Good {

	String name;
	double weight;
	double price;

	public Good(String name, double weight, double price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	public Good(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Good other = (Good) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int cftnt = 42;
		int res = 1;
		res = cftnt * res + ((name == null) ? 0 : name.hashCode());

		return res;
	}

	@Override
	public String toString() {
		return name;
	}
}