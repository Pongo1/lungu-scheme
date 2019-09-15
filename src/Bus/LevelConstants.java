package Bus;

import java.util.HashMap;
public class LevelConstants {
	private static int INFINITE = -1;

	/*
	 *  = { levelConstant, defaultFolderAllowance, defaultImageAllowance };
	 * 
	 */
	public static final Integer HIGHEST_RANK_CONST = 1; 
	public static final Integer LOWEST_RANK_CONST = 5; 

	public static final String TYPE_A="TYPE A"; 
	public static final String TYPE_B="TYPE B"; 
	public static final String TYPE_C="TYPE C"; 
	
	public static final Integer[] TYPE_A_LEVEL_INFO = {1,INFINITE,6}; 
	public static final Integer[] TYPE_B_LEVEL_INFO = {3,20,3}; 
	public static final Integer[] TYPE_C_LEVEL_INFO = {5,10,2}; 
	
	public static HashMap<String,Integer[]> levelInformation = new HashMap<String,Integer[]>();
	public static Integer[][] levelInformationArray= {TYPE_A_LEVEL_INFO,TYPE_B_LEVEL_INFO,TYPE_C_LEVEL_INFO};

	static {
		levelInformation.put(TYPE_A,TYPE_A_LEVEL_INFO);
		levelInformation.put(TYPE_B,TYPE_B_LEVEL_INFO); 
		levelInformation.put(TYPE_C,TYPE_C_LEVEL_INFO);
	}
	public static Integer checkForConstant(String label) {
		switch(label){
			case TYPE_A: 
				return 1;
			case TYPE_B: 
				return 3; 
			case TYPE_C: 
				return 5;
		}
		return -1;	
	}
	
	public static String checkForLabel(int constant) {
		switch(constant){
			case 1: 
				return TYPE_A;
			case 3: 
				return TYPE_B; 
			case 5: 
				return TYPE_C;
		}
		return null;	
	}

	
	
	
	
}
