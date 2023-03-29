package application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {

	public void cria(InputStream inputStream, String nomeArquivo) throws Exception{
	//leitura da imagem
	BufferedImage imagemOriginal = ImageIO.read(inputStream);
	 
	//cria imagem em memoria com transparencia e com tamanho novo
	int largura = imagemOriginal.getWidth();
	int altura = imagemOriginal.getHeight();
	int novaAltura = altura + 200;
	
	BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);
	
	
	// copiar a imagem original pra nova imagem (em memoria)
	Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
	graphics.drawImage(imagemOriginal, 0, 0, null);
	
	// configurar a fonte
		var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
		graphics.setColor(Color.YELLOW);
	    graphics.setFont(fonte);
	
	// escrever uma frase na nova imagem
	graphics.drawString("TOPZERA", 180, novaAltura - 100);
	
	
	// escreever a nova imagem em um arquivo
	ImageIO.write(novaImagem, "png", new File(nomeArquivo) );
	
	}
}
