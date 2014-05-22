
public class Game {
	
	private int rolls[] = new int[21];
	private int currentRoll = 0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void roll(int pins){
		rolls[currentRoll++] = pins;
	}
	
	public int score(){
		int score = 0;
		int framIndex = 0;
		for(int frame = 0; frame < 10; frame++){
			if(rolls[frame] == 10){
				score += 10 + 
						rolls[framIndex + 1]
								+ rolls[framIndex + 2];
				framIndex++;
			}
			if(this.isSpare(framIndex)){
				score += 10 + rolls[framIndex + 2];
				framIndex += 2;
			}else{
				score += rolls[framIndex] + rolls[framIndex + 1];
				framIndex += 2;
			}
		}
		return score;
	}
	
	private boolean isSpare(int frameIndex){
		return (rolls[frameIndex] + rolls[frameIndex+1] == 10);
			
	}

}
