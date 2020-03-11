public class Control {

	public static void main(String[] args) {
		FileProcessing f1 = new FileProcessing("females.txt");
		f1.openFile();
		String tokenRead = f1.readToken();
		System.out.println(tokenRead);
		tokenRead = f1.readToken();
		System.out.println(tokenRead);
		f1.write("Test");
	}

}
