package application;

public class Conteudo {

	private final String titulo; //final -> n pode mudar depois de criado
	private final String urlImagem;
	
	
	public Conteudo(String titulo, String urlImagem) {
		this.titulo = titulo;
		this.urlImagem = urlImagem;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	
	
}
