package exercicio06;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
		
	}

	private void start() {
		
		String[] carros = {"civic","gol","palio","uno"};
		
		for (int i = 0; i < carros.length; i++) {
			
			String carro = carros[i];
			System.out.println("Nome carro: " + carro);
			
		}
		System.out.println("---------------------------------");
		
		
		carros[1] = "L200";
		
		for (String carro : carros) {
			System.out.println("Nome carro: " + carro);
		}		
		
		System.out.println("---------------------------------");
		int tamanhoDoArray = carros.length + 1;
		String[] novoArrayDeCarros = new String[tamanhoDoArray];
		
		
		//CTRL + SHIFT + F
		
		for (int i = 0; i < carros.length; i++) {
			
			String novoCarro = carros[i];
			novoArrayDeCarros[i] = novoCarro;
			
		}
		novoArrayDeCarros[tamanhoDoArray - 1] = "Gol";
		for (String carro : novoArrayDeCarros) {
			System.out.println("Carro: " + carro);

		}
		

		
		
		
	}

	
}

