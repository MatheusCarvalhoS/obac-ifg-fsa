package br.edu.ifg.formosa.obac.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import br.edu.ifg.formosa.obac.models.Object;

import javax.swing.ImageIcon;

public class ObjectView extends Panel {
	
	private Image offScreenImage; // imagem auxiliar declarada na classe
	private	ImageIcon imgCubo;
	private Object objeto;
	private boolean ver = false;

	public ObjectView(){
		//imgCubo = new ImageIcon("cubo.png");
		this.setLayout(null);
		this.setBackground(Color.black);
	}
	
	public void repinta(Object objeto){
		this.objeto = objeto;
		this.ver = true;
		this.setBounds((int)objeto.getPosicaoAtual()+50, 0, 30, 30);
		this.repaint();
	}
	
	public void paint(Graphics g){
	
		g.setColor(Color.black);
		if(ver){
			g.fillRect((int)objeto.getPosicaoAtual()+50, 0, 30, 30);
			System.out.println("entrei aqui IF...");
		}
		else{
			g.fillRect(50, 0, 30, 30);
		}
		
	}
	
	   public void update( Graphics g ) 
	   { 
	     // Criar a imagem auxiliar e buscar o seu context gr�fico
	     if( offScreenImage == null ) 
	     offScreenImage = createImage( getSize().width, getSize().height ); 
	     Graphics offScreenGraphics = offScreenImage.getGraphics(); 
	     // limpar a imagem auxiliar
	     offScreenGraphics.setColor( getBackground() ); 
	     offScreenGraphics.fillRect( 0, 0, getSize().width, getSize().height ); 
	     // pintar a imagem auxiliar
	     offScreenGraphics.setColor( g.getColor() ); 
	     paint( offScreenGraphics ); 
	     // transferir a imagem auxiliar para a tela
	     g.drawImage( offScreenImage, 0, 0, this ); 
	     offScreenGraphics.dispose(); 
	   } 
	
}
