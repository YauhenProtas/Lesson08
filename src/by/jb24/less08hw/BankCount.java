package by.jb24.less08hw;

public class BankCount {
	private int restNumber;
	private int restBalance;
	private String restOwner;

	public BankCount() {
		restNumber = 301200000;
		restBalance = 0;
		restOwner = null;
	}
	public BankCount(int _restNumber,int _restBalance, String _restOwner) {
		restNumber = _restNumber;
		restBalance = _restBalance;
		restOwner = _restOwner;
	}
	public int getRestNumber() {
		return restNumber;
	}
	public void setRestNumber(int restNumber) {
		this.restNumber = restNumber;
	}
	public int getRestBalance() {
		return restBalance;
	}
	public void setRestBalance(int restBalance) {
		this.restBalance = restBalance;
	}
	public String getRestOwner() {
		return restOwner;
	}
	public void setRestOwner(String restOwner) {
		this.restOwner = restOwner;
	}
	
	public boolean equals (Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (this == obj) {
			return false;
		}
		
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		BankCount bcnt = (BankCount)obj;
		if (restNumber != bcnt.restNumber) {
			return false;
		}
		if (restBalance != bcnt.restBalance) {
			return false;
		}
		if (null == restOwner) {
			return (restOwner == bcnt.restOwner);
		}else {
			if (!restOwner.equals(bcnt.restOwner)) {
				return false;
			}
		}return true;
	}
	
	public int hashCode() {
		return (int) (42 * restNumber * restBalance + ((null == restOwner) ? 0 : restOwner.hashCode()));
	}
	
	
}

