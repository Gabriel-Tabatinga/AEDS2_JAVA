
public class Application {

	public static void main(String[] args) {
		
		int resposta;
		System.out.println("Quer escrever ou ler o arquivo? Digite 1 para escrever e 2 para ler");
		resposta = MyIO.readInt();
		
		if(resposta == 1) {
			String nomeArquivo;
			String entrada;
			ArquivoTextoEscrita arqEscrita;
			
			System.out.println("Informe o nome do arquivo onde os dados serao gravados: ");
			nomeArquivo = MyIO.readLine();
			
			arqEscrita = new ArquivoTextoEscrita(nomeArquivo + ".txt");
			
			System.out.println("Informe o texto que sera gravado no arquivo\nEsse texto pode ter varias linhas.\nDigite \"Parar\" quando terminas\n");
			entrada = MyIO.readLine();
			while(!entrada.equals("Parar")) {
				arqEscrita.escrever(entrada);
				entrada = MyIO.readLine();
			}
			arqEscrita.fecharArquivo();
		}else {
			String nomeArquivo;
			String leitura;
			ArquivoTextoLeitura arqLeitura;
			System.out.println("Informe o nome do arquivo a ser lido: ");
			nomeArquivo = MyIO.readLine();
			arqLeitura = new ArquivoTextoLeitura(nomeArquivo);
			
			leitura = arqLeitura.ler();
			while(leitura != null) {
				System.out.println(leitura);
				leitura = arqLeitura.ler();
			}
			arqLeitura.fecharArquivo();
		}
	}
}
