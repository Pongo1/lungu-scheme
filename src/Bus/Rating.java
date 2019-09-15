package Bus;

public class Rating {
	public static final int MAX_RATE_VALUE = 10;
	private String busID;
	private String ratorID;
	private String ratingID;
	private int SERVICE_VALUE =0; 
	private int ITEM_QUALITY_VALUE = 0; 
	private int PRICE_RATING= 0;
	private String comment ;
	

	public Rating(String busID, String ratorID, String ratingID, int serviceValue, int itemQualityValue , int priceRatingValue, String comment) {
		this.busID = busID; 
		this.ratorID = ratorID; 
		this.ratingID = ratingID; 
		this.SERVICE_VALUE = serviceValue; 
		this.ITEM_QUALITY_VALUE = itemQualityValue; 
		this.PRICE_RATING = priceRatingValue;
		this.setComment(comment);
		
	}

	public int getSERVICE_VALUE() {
		return SERVICE_VALUE;
	}

	public void setSERVICE_VALUE(int sERVICE_VALUE) {
		SERVICE_VALUE = sERVICE_VALUE;
	}

	public int getITEM_QUALITY_VALUE() {
		return ITEM_QUALITY_VALUE;
	}

	public void setITEM_QUALITY_VALUE(int iTEM_QUALITY_VALUE) {
		ITEM_QUALITY_VALUE = iTEM_QUALITY_VALUE;
	}

	public int getPRICE_RATING() {
		return PRICE_RATING;
	}

	public void setPRICE_RATING(int pRICE_RATING) {
		PRICE_RATING = pRICE_RATING;
	}

	public String getBusID() {
		return busID;
	}

	public void setBusID(String busID) {
		this.busID = busID;
	}

	public String getRatorID() {
		return ratorID;
	}

	public void setRatorID(String ratorID) {
		this.ratorID = ratorID;
	}

	public String getRatingID() {
		return ratingID;
	}

	public void setRatingID(String ratingID) {
		this.ratingID = ratingID;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
