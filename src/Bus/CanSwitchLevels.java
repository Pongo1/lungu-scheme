package Bus;

interface CanSwitchLevels {
	
	public abstract void upgrade(); 
	
	public abstract void downgrade(); 
	
	public abstract void changeLevel(String prefLevel);

}
