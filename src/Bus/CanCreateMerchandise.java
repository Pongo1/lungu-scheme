package Bus;

interface CanCreateMerchandise {
	
	public abstract Merchandise createMerchandise(String itemName,String description, String itemID,String folderID, String[] imagesArray);
	
	public abstract void deleteMerchandise(String merchID);

}
