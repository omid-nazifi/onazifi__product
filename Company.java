class Company {
	
	private LinkedList products;
	private String name = "IBM";
	private String registerNumber = "None";
	
	public Company() {
	}
	
	public String getName() {
		return name;
	}
	
	public String getRegisaterNumber() {
		return registerNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void getRegisaterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
}