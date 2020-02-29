package caesars.cipher;

public class CaesarsCipher {
	
	private static final char LETTERA ='a';
	
	private static final char LETTERZ ='z';
	
	private static final int ALPHABET_SIZE= 26;
	
	
	//method used to generate cipher
	public String cipher(String message, int offset) {
		offset %=ALPHABET_SIZE;
		char[] character=message.toCharArray();
		offSetBy(character,offset);
		return new String(character);
	}


	public void offSetBy(char[] character, int offset) {
		
		for (int i = 0; i < character.length; i++) {
			if(character[i]!=' ')
			character[i]=offSetChar(character[i],offset,LETTERA,LETTERZ);
		}
		
	}


	public char offSetChar(char c, int offset, char letterA, char letterZ) {
		c+=offset;
		if(c<letterA) {
			return (char) (c+ALPHABET_SIZE);
		}
		
		if(c>letterZ) {
			return (char) (c-ALPHABET_SIZE);
		}
		
		return c;
	}
	
	
	

}
