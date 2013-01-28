package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.utils.TransparentLabel;

public class InfoPanelControl {
	
	private TransparentLabel lbGravityValue;
	private TransparentLabel lbCoefAtritoValue;
	private TransparentLabel lbFor�aAtritoValue;
	private TransparentLabel lbFor�aNormalValue;
	private TransparentLabel lbPosFinalValue;
	private TransparentLabel lbAcelera��oValue;
	private TransparentLabel lbTempoValue;
	private TransparentLabel lbPosAtualEixoxValue;
	private TransparentLabel lbPosAtualEixoyValue;
	
	public InfoPanelControl(TransparentLabel lbGravityValue, TransparentLabel lbCoefAtritoValue, TransparentLabel lbFor�aAtritoValue, 
			TransparentLabel lbFor�aNormalValue, TransparentLabel lbPosFinalValue, TransparentLabel lbAcelera��oValue, 
			TransparentLabel lbTempoValue, TransparentLabel lbPosAtualEixoxValue, TransparentLabel lbPosAtualEixoyValue){
		
		this.lbGravityValue = lbGravityValue;
		this.lbCoefAtritoValue = lbCoefAtritoValue;
		this.lbFor�aAtritoValue = lbFor�aAtritoValue;
		this.lbFor�aNormalValue = lbFor�aNormalValue;
		this.lbPosFinalValue = lbPosFinalValue;
		this.lbAcelera��oValue = lbAcelera��oValue;
		this.lbTempoValue = lbTempoValue;
		this.lbPosAtualEixoxValue = lbPosAtualEixoxValue;
		this.lbPosAtualEixoyValue = lbPosAtualEixoyValue;
	}
	
	public void changeValueGravity(double value ){
		lbGravityValue.setText("" + value);
	}
	
	public void changeValueCoefAtrito(double value ){
		lbCoefAtritoValue.setText("" + value);
	}
	
	public void changeValueFor�aAtrito(double value ){
		lbFor�aAtritoValue.setText("" + value);
	}
	
	public void changeValueFor�aNormal(double value ){
		lbFor�aNormalValue.setText("" + value);
	}
	
	public void changeValuePosFinal(double value ){
		lbPosFinalValue.setText("" + value);
	}
	
	public void changeValueAcelera��o(double value ){
		lbAcelera��oValue.setText("" + value);
	}
	
	public void changeValueTempo(double value ){
		lbTempoValue.setText("" + value);
	}
	
	public void changeValuePosAtualEixox(double value ){
		lbPosAtualEixoxValue.setText("" + value);
	}
	
	public void changeValuePosAtualEixoy(double value ){
		lbPosAtualEixoyValue.setText("" + value);
	}
	
}
