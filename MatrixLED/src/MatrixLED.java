
public class MatrixLED {
	
	
	public static void main(String[] args) {
		System.out.println("MatrixLED");
		
		System.out.println("\nsimple variables");
		short maskPos1 = 1;
		short maskPos2 = 1 << 1;
		short maskPos3 = 1 << 2;
		
		System.out.println(Integer.toBinaryString(maskPos1));
		System.out.println(Integer.toBinaryString(maskPos2));
		System.out.println(Integer.toBinaryString(maskPos3));
		
		System.out.println("\nArray of 7 masks");
		short[] bitMasks = new short[7];
		initMasks(bitMasks, (short)7);

		for(short i=0; i<7; i++) {
			System.out.format("Index %d: %s%n", i,Integer.toBinaryString(bitMasks[i]));		
		}
		
		
	} // end main

	private static void initMasks(short[] bitMasks, short numBitMasks) {
		bitMasks[0] = 1;
		for(short i=1; i<numBitMasks; i++) {
			bitMasks[i] = (short) ((short) 1 << i);
		}
	} // end initMasks
	
}
