package caesars.cipher;

public class main {

	public static void main(String[] args) {
		
		String message="hi how are you doing";
		int offset=12;

		CaesarsCipher caesarsCipher=new CaesarsCipher();
		
		
		
		System.out.println("message:"+"hi how are you doing");
		System.out.println("offset:"+offset);
		System.out.println("CipheredMessage:"+caesarsCipher.cipher(message, offset));
		
		
		
	}

}
