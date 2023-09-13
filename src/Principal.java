import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		String app;
		Scanner ler = new Scanner(System.in);
		app = ler.nextLine();
		switch(app) {
			case "netflix":
				System.out.println("TuDum");
			break;
			case "disney":
				System.out.println("Plim Plim");
			break;
			case "amazon":
				System.out.println("Tiro e Bomba");
			break;
			default:
				System.out.println("App não reconhecido!");
			break;
		}
		

	}

}
