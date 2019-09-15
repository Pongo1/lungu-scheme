package Bus;

public abstract class Business {
	private String ownerName; 
	private String companyName; 
	private String businessID;
	private String companyLogo;
	
	public Business(String ownerName, String companyName, String businessID, String companyLogo) {
		this.ownerName = ownerName; 
		this.companyName = companyName; 
		this.businessID = businessID;
		this.companyLogo = companyLogo;
	}

	public String getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getBusinessID() {
		return businessID;
	}

	public void setBusinessID(String businessID) {
		this.businessID = businessID;
	}

}
