package Bus;

import java.util.HashMap;

public class Upgradable {
	
	private Integer[][] infoArr = LevelConstants.levelInformationArray;
	private HashMap<String, Integer[]> levelMap= LevelConstants.levelInformation;
	
	
	public Integer[] getUpgradableInformation(Integer currentLevel) {
		if(currentLevel < LevelConstants.HIGHEST_RANK_CONST || currentLevel > LevelConstants.LOWEST_RANK_CONST) {
			return null;
		}
		Integer[] next_level = null;
		Integer maximumLevelConst = infoArr[0][0];
		for(int i = 0; i < infoArr.length; i ++ ) {
			//check if the business is not on the max level 
			if(currentLevel != maximumLevelConst) {
				//find the current level, and give me the previous rank 
				//Ranks are in descending order
				if( infoArr[i][0] == currentLevel) {
					return infoArr[i-1];
				}
			}
		}
		return next_level;
	}
	
	public Integer[] getUpgradableInformation(String label) {
		Integer[] next_level = null;
		Integer constant = LevelConstants.checkForConstant(label);
		Integer maximumLevelConst = infoArr[0][0];
		for(int i = 0; i < infoArr.length; i ++ ) {
			//check if the business is not on the max level 
			if(constant != maximumLevelConst) {
				//find the current level, and give me the previous rank 
				//Ranks are in descending order
				if( infoArr[i][0] == constant) {
					return infoArr[i-1];
				}
			}
		}
		return next_level;
	}
	
	public Integer[] getDowngradableInformation(Integer currentLevel) {
		if(currentLevel < LevelConstants.HIGHEST_RANK_CONST || currentLevel > LevelConstants.LOWEST_RANK_CONST) {
			return null;
		}
		Integer[] next_level = null;
		Integer lowestLevelConst = infoArr[infoArr.length -1][0];
		for(int i = 0; i < infoArr.length; i ++ ) {
			//check if the business is not on the min rank 
			if(currentLevel != lowestLevelConst) {
				//find the rank level, and give me the next rank 
				//Ranks are in descending order inside the array
				if( infoArr[i][0] == currentLevel) {
					return infoArr[i+1];
				}
			}
		}
		return next_level;
	}
	
	public Integer[] getDowngradableInformation(String label) {
		Integer[] next_level = null;
		Integer constant = LevelConstants.checkForConstant(label);
		Integer lowestLevelConst = infoArr[infoArr.length -1][0];
		for(int i = 0; i < infoArr.length; i ++ ) {
			//check if the business is not on the min rank 
			if(constant != lowestLevelConst) {
				//find the rank level, and give me the next rank 
				//Ranks are in descending order inside the array
				if( infoArr[i][0] == constant) {
					return infoArr[i+1];
				}
			}
		}
		return next_level;
	}
	
	public Integer[] changeToLevel(String label) {
		return levelMap.get(label);
	}
	public Integer[] changeToLevel(Integer constant) {
		if(constant < LevelConstants.HIGHEST_RANK_CONST || constant > LevelConstants.LOWEST_RANK_CONST) {
			return null;
		}
		String label = LevelConstants.checkForLabel(constant);
		return levelMap.get(label);
	}
	

}
