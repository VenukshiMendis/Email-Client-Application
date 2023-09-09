package pc_assignment;

public class Official extends Recipient {
	private String designation;
	
	
	public Official(String name,String email,String designation) {
		super(name,email,"Official");
		
		this.designation = designation;

	
		
	}


	public String getDesignation() {
		return designation;
	}



	
	
	
	
	
	

}
