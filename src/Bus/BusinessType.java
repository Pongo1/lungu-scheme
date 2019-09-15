package Bus;

public class BusinessType extends Business implements CanMakeFolders,CanCreateMerchandise,CanSwitchLevels{
	private String MY_BUSINESS_LABEL = LevelConstants.TYPE_C; 
	public Integer[] MY_INFO = LevelConstants.levelInformation.get(MY_BUSINESS_LABEL); 
	private int MY_FOLDER_LIMIT = MY_INFO[1]; 
	private int MY_REM_FOLDER_LIMIT = MY_FOLDER_LIMIT; 
	private int MY_PIC_UPLOAD_ALLOWANCE = MY_INFO[2];
	private int TOP_AD_BUNDLE = 0; 
	private Upgradable upgradable = new Upgradable();

	
	public BusinessType(String ownerName, String companyName, String businessID, String companyLogo) {
		super(ownerName, companyName, businessID, companyLogo);
	}

	public String getMY_BUSINESS_LABEL() {
		return MY_BUSINESS_LABEL;
	}

	public void setMY_BUSINESS_LABEL(String mY_BUSINESS_LABEL) {
		MY_BUSINESS_LABEL = mY_BUSINESS_LABEL;
	}
	
	public int getMY_FOLDER_LIMIT() {
		return MY_FOLDER_LIMIT;
	}

	public void setMY_FOLDER_LIMIT(int mY_FOLDER_LIMIT) {
		MY_FOLDER_LIMIT = mY_FOLDER_LIMIT;
	}

	public int getMY_REM_FOLDER_LIMIT() {
		return MY_REM_FOLDER_LIMIT;
	}

	public void setMY_REM_FOLDER_LIMIT(int mY_REM_FOLDER_LIMIT) {
		MY_REM_FOLDER_LIMIT = mY_REM_FOLDER_LIMIT;
	}

	public int getMY_PIC_UPLOAD_ALLOWANCE() {
		return MY_PIC_UPLOAD_ALLOWANCE;
	}

	public void setMY_PIC_UPLOAD_ALLOWANCE(int mY_PIC_UPLOAD_ALLOWANCE) {
		MY_PIC_UPLOAD_ALLOWANCE = mY_PIC_UPLOAD_ALLOWANCE;
	}

	public int getTOP_AD_BUNDLE() {
		return TOP_AD_BUNDLE;
	}

	public void setTOP_AD_BUNDLE(int tOP_AD_BUNDLE) {
		TOP_AD_BUNDLE = tOP_AD_BUNDLE;
	}

	@Override
	public Folder makeFolder(String folderName, String folderColor) {
		Folder newFolder = new Folder(folderName,this.getBusinessID(),folderColor); 
		return newFolder;
	}

	@Override
	public void deleteFolder(String folderID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Merchandise createMerchandise(String itemName, String description, String itemID, String folderID,
			 String[] imagesArray) {
		Merchandise merch = new Merchandise(itemName,description,itemID,folderID,this.getBusinessID(),imagesArray);
		return merch;
	}

	@Override
	public void deleteMerchandise(String merchID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upgrade() {
		Integer[] info = upgradable.getUpgradableInformation(MY_BUSINESS_LABEL);
		if(info !=null) {
			String nextLabel = LevelConstants.checkForLabel(info[0]);
			this.setMY_BUSINESS_LABEL(nextLabel);
			this.setMY_FOLDER_LIMIT(info[1]);
			this.setMY_REM_FOLDER_LIMIT(info[1]);
			this.setMY_PIC_UPLOAD_ALLOWANCE(info[2]);
			//	with this the current class, would have moved to the next available level
			//	most probably after some kind of payment 
			// Persist the current state into a db from here
		}
	}

	@Override
	public void downgrade() {
		Integer[] info = upgradable.getDowngradableInformation(MY_BUSINESS_LABEL);
		if(info !=null) {
			String prevLabel = LevelConstants.checkForLabel(info[0]);
			this.setMY_BUSINESS_LABEL(prevLabel);
			this.setMY_FOLDER_LIMIT(info[1]);
			this.setMY_REM_FOLDER_LIMIT(info[1]);
			this.setMY_PIC_UPLOAD_ALLOWANCE(info[2]);
			//	with this the current class, would have moved to the next available level
			//	most probably after some kind of payment 
			// Persist the current state into a db from here
		}
	}

	@Override
	public void changeLevel(String prefLevel) {
		Integer[] info = upgradable.changeToLevel(prefLevel); 
		if( info !=null) {
			this.setMY_BUSINESS_LABEL(prefLevel);
			this.setMY_FOLDER_LIMIT(info[1]);
			this.setMY_REM_FOLDER_LIMIT(info[1]);
			this.setMY_PIC_UPLOAD_ALLOWANCE(info[2]);
		}
	}

	
	
}
