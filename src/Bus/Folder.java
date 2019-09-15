package Bus;

public class Folder {
	private String folderName; 
	private String businessID;
	private String folderColor;
	public Folder(String folderName,String businessID, String folderColor) {
		this.folderName = folderName; 
		this.businessID = businessID; 
		this.folderColor = folderColor;
	}
	public String getFolderColor() {
		return folderColor;
	}
	public void setFolderColor(String folderColor) {
		this.folderColor = folderColor;
	}
	public String getFolderName() {
		return folderName;
	}
	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}
	public String getBusinessID() {
		return businessID;
	}
	public void setBusinessID(String businessID) {
		this.businessID = businessID;
	}
	
}
