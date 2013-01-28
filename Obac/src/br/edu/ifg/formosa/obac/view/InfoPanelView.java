package br.edu.ifg.formosa.obac.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Label;

import javax.swing.JPanel;

import br.edu.ifg.formosa.obac.controls.InfoPanelControl;
import br.edu.ifg.formosa.obac.utils.TransparentLabel;

public class InfoPanelView extends JPanel{
	
	private InfoPanelControl infoPanelControl;
	public TransparentLabel getLbGravity() {
		return lbGravity;
	}

	public void setLbGravity(TransparentLabel lbGravity) {
		this.lbGravity = lbGravity;
	}

	public TransparentLabel getLbGravityValue() {
		return lbGravityValue;
	}

	public void setLbGravityValue(TransparentLabel lbGravityValue) {
		this.lbGravityValue = lbGravityValue;
	}

	public TransparentLabel getLbCoefAtrito() {
		return lbCoefAtrito;
	}

	public void setLbCoefAtrito(TransparentLabel lbCoefAtrito) {
		this.lbCoefAtrito = lbCoefAtrito;
	}

	public TransparentLabel getLbCoefAtritoValue() {
		return lbCoefAtritoValue;
	}

	public void setLbCoefAtritoValue(TransparentLabel lbCoefAtritoValue) {
		this.lbCoefAtritoValue = lbCoefAtritoValue;
	}

	public TransparentLabel getLbFor�aAtrito() {
		return lbFor�aAtrito;
	}

	public void setLbFor�aAtrito(TransparentLabel lbFor�aAtrito) {
		this.lbFor�aAtrito = lbFor�aAtrito;
	}

	public TransparentLabel getLbFor�aAtritoValue() {
		return lbFor�aAtritoValue;
	}

	public void setLbFor�aAtritoValue(TransparentLabel lbFor�aAtritoValue) {
		this.lbFor�aAtritoValue = lbFor�aAtritoValue;
	}

	public TransparentLabel getLbFor�aNormal() {
		return lbFor�aNormal;
	}

	public void setLbFor�aNormal(TransparentLabel lbFor�aNormal) {
		this.lbFor�aNormal = lbFor�aNormal;
	}

	public TransparentLabel getLbFor�aNormalValue() {
		return lbFor�aNormalValue;
	}

	public void setLbFor�aNormalValue(TransparentLabel lbFor�aNormalValue) {
		this.lbFor�aNormalValue = lbFor�aNormalValue;
	}

	public TransparentLabel getLbPosFinal() {
		return lbPosFinal;
	}

	public void setLbPosFinal(TransparentLabel lbPosFinal) {
		this.lbPosFinal = lbPosFinal;
	}

	public TransparentLabel getLbPosFinalValue() {
		return lbPosFinalValue;
	}

	public void setLbPosFinalValue(TransparentLabel lbPosFinalValue) {
		this.lbPosFinalValue = lbPosFinalValue;
	}

	public TransparentLabel getLbAcelera��o() {
		return lbAcelera��o;
	}

	public void setLbAcelera��o(TransparentLabel lbAcelera��o) {
		this.lbAcelera��o = lbAcelera��o;
	}

	public TransparentLabel getLbAcelera��oValue() {
		return lbAcelera��oValue;
	}

	public void setLbAcelera��oValue(TransparentLabel lbAcelera��oValue) {
		this.lbAcelera��oValue = lbAcelera��oValue;
	}

	public TransparentLabel getLbTempo() {
		return lbTempo;
	}

	public void setLbTempo(TransparentLabel lbTempo) {
		this.lbTempo = lbTempo;
	}

	public TransparentLabel getLbTempoValue() {
		return lbTempoValue;
	}

	public void setLbTempoValue(TransparentLabel lbTempoValue) {
		this.lbTempoValue = lbTempoValue;
	}

	public TransparentLabel getLbPosAtualEixox() {
		return lbPosAtualEixox;
	}

	public void setLbPosAtualEixox(TransparentLabel lbPosAtualEixox) {
		this.lbPosAtualEixox = lbPosAtualEixox;
	}

	public TransparentLabel getLbPosAtualEixoxValue() {
		return lbPosAtualEixoxValue;
	}

	public void setLbPosAtualEixoxValue(TransparentLabel lbPosAtualEixoxValue) {
		this.lbPosAtualEixoxValue = lbPosAtualEixoxValue;
	}

	public TransparentLabel getLbPosAtualEixoy() {
		return lbPosAtualEixoy;
	}

	public void setLbPosAtualEixoy(TransparentLabel lbPosAtualEixoy) {
		this.lbPosAtualEixoy = lbPosAtualEixoy;
	}

	public TransparentLabel getLbPosAtualEixoyValue() {
		return lbPosAtualEixoyValue;
	}

	public void setLbPosAtualEixoyValue(TransparentLabel lbPosAtualEixoyValue) {
		this.lbPosAtualEixoyValue = lbPosAtualEixoyValue;
	}

	private TransparentLabel lbGravity;
	private TransparentLabel lbGravityValue;
	private TransparentLabel lbCoefAtrito;
	private TransparentLabel lbCoefAtritoValue;
	private TransparentLabel lbFor�aAtrito;
	private TransparentLabel lbFor�aAtritoValue;
	private TransparentLabel lbFor�aNormal;
	private TransparentLabel lbFor�aNormalValue;
	private TransparentLabel lbPosFinal;
	private TransparentLabel lbPosFinalValue;
	private TransparentLabel lbAcelera��o;
	private TransparentLabel lbAcelera��oValue;
	private TransparentLabel lbTempo;
	private TransparentLabel lbTempoValue;
	private TransparentLabel lbPosAtualEixox;
	private TransparentLabel lbPosAtualEixoxValue;
	private TransparentLabel lbPosAtualEixoy;
	private TransparentLabel lbPosAtualEixoyValue;
	
	public InfoPanelView(){
		this.setLayout(null);
		this.setSize(600, 40);
		this.setLocation(0, 0);
		this.setOpaque(false);
		//this.setBackground(Color.white);
		
		//Gravidade
		lbGravity = new TransparentLabel("Gravidade:");
		lbGravity.setBounds(10, 2, 70, 20);
		this.add(lbGravity);
		
		lbGravityValue = new TransparentLabel("0");
		lbGravityValue.setBounds(70, 2, 70, 20);
		this.add(lbGravityValue);
		
		//Coef. de Atrito
		lbCoefAtrito = new TransparentLabel("Coef. Atrito:");
		lbCoefAtrito.setBounds(10, 18, 70, 20);
		this.add(lbCoefAtrito);
		
		lbCoefAtritoValue = new TransparentLabel("0");
		lbCoefAtritoValue.setBounds(70, 18, 70, 20);
		this.add(lbCoefAtritoValue);
		
		//For�a de Atrito
		lbFor�aAtrito = new TransparentLabel("For�a Atrito:");
		lbFor�aAtrito.setBounds(110, 2, 70, 20);
		this.add(lbFor�aAtrito);
		
		lbFor�aAtritoValue = new TransparentLabel("0");
		lbFor�aAtritoValue.setBounds(185, 2, 70, 20);
		this.add(lbFor�aAtritoValue);
		
		//For�a Normal
		lbFor�aNormal = new TransparentLabel("Forca Normal:");
		lbFor�aNormal.setBounds(110, 18, 80, 20);
		this.add(lbFor�aNormal);
		
		lbFor�aNormalValue = new TransparentLabel("0");
		lbFor�aNormalValue.setBounds(185, 18, 80, 20);
		this.add(lbFor�aNormalValue);
		
		//Pos. Final
		lbPosFinal = new TransparentLabel("Pos. Final:");
		lbPosFinal.setBounds(250, 2, 70, 20);
		this.add(lbPosFinal);
		
		lbPosFinalValue = new TransparentLabel("0");
		lbPosFinalValue.setBounds(315, 2, 70, 20);
		this.add(lbPosFinalValue);
		
		//Acelera��o
		lbAcelera��o = new TransparentLabel("Acelera��o:");
		lbAcelera��o.setBounds(250, 18, 80, 20);
		this.add(lbAcelera��o);
		
		lbAcelera��oValue = new TransparentLabel("0");
		lbAcelera��oValue.setBounds(315, 18, 80, 20);
		this.add(lbAcelera��oValue);
		
		//Tempo
		lbTempo = new TransparentLabel("Tempo:");
		lbTempo.setBounds(360, 2, 45, 20);
		this.add(lbTempo);
		
		lbTempoValue = new TransparentLabel("0");
		lbTempoValue.setBounds(402, 2, 45, 20);
		this.add(lbTempoValue);
		
		//Pos. Atual Eixo x:
		lbPosAtualEixox = new TransparentLabel("Pos. Atual Eixo x:");
		lbPosAtualEixox.setBounds(445, 2, 100, 20);
		this.add(lbPosAtualEixox);
		
		lbPosAtualEixoxValue = new TransparentLabel("0");
		lbPosAtualEixoxValue.setBounds(537, 2, 100, 20);
		this.add(lbPosAtualEixoxValue);
		
		//Pos. Atual Eixo y:
		lbPosAtualEixoy = new TransparentLabel("Pos. Atual Eixo y:");
		lbPosAtualEixoy.setBounds(445, 18, 100, 20);
		this.add(lbPosAtualEixoy);
				
		lbPosAtualEixoyValue = new TransparentLabel("0");
		lbPosAtualEixoyValue.setBounds(537, 18, 100, 20);
		this.add(lbPosAtualEixoyValue);
		
		infoPanelControl = new InfoPanelControl(lbGravityValue, lbCoefAtritoValue, lbFor�aAtritoValue, 
				lbFor�aNormalValue, lbPosFinalValue, lbAcelera��oValue, lbTempoValue, lbPosAtualEixoxValue, lbPosAtualEixoyValue);
		

		
		
	}
	
	public InfoPanelControl getInfoPanelControl() {
		return infoPanelControl;
	}

	public void setInfoPanelControl(InfoPanelControl infoPanelControl) {
		this.infoPanelControl = infoPanelControl;
	}

	public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Color ppColor = new Color(0, 0, 0, 115); //r,g,b,alpha
        g.setColor(ppColor);
        g.fillRect(0,0,600,40); //x,y,width,height
    }    
	
}
