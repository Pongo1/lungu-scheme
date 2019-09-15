package Bus;

public class Merchandise {

	private String itemName; 
	private String description; 
	private String itemID; 
	private String folderID;
	private String businessID;
	private String[] imagesArray;
	
	public Merchandise(String itemName,String description, String itemID,String folderID, String businessID,String[] imagesArray) {
		this.itemName = itemName; 
		this.description = description; 
		this.itemID = itemID; 
		this.folderID = folderID;
		this.imagesArray = imagesArray;
		this.businessID = businessID;
		
	}
	
	public String getBusinessID() {
		return businessID;
	}

	public void setBusinessID(String businessID) {
		this.businessID = businessID;
	}

	public String[] getImagesArray() {
		return imagesArray;
	}

	public void setImagesArray(String[] imagesArray) {
		this.imagesArray = imagesArray;
	}

	/*
	    * Every image a user uploads will be uploaded three times 
		* the first will be the exact full-sized image uploaded by the user 
		* the second will be a resized version of 100 x 100 
		* the third will be a resized version of 60 x 60
		* all images will be jpgs  
	 */
	public String getMediumVersionOfImage(String imageName) {
		return imageName + "-mid-img-cover.jpg";
	}
	public String getSmallestVersionOfImage(String imageName) {
		return imageName + "-small-img-cover.jpg";
	}
	public String getCoverPhoto() {
		return imagesArray[0];
	}
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getFolderID() {
		return folderID;
	}

	public void setFolderID(String folderID) {
		this.folderID = folderID;
	}

	
}
