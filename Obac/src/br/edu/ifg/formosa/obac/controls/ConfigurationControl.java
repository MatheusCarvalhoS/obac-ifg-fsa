package br.edu.ifg.formosa.obac.controls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.JOptionPane;

import br.edu.ifg.formosa.obac.main.Obac;
import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.models.Surface;
import br.edu.ifg.formosa.obac.view.ConfigurationView;
import br.edu.ifg.formosa.obac.models.Object;

public class ConfigurationControl {
	
	private ConfigurationView configurationView;
	private Environment environment;
	private Object objeto;
	private Surface surface;
	private Obac obac;
		
	public ConfigurationControl(Obac obac, ConfigurationView configurationView){
		
		this.configurationView = configurationView;
		
		
		
		environment = new Environment();
		objeto = new Object();
		surface = new Surface();
		
		addActionListeners();
		
		//objeto.setAltura(0);
		surface.setCoefFriction(0.62);
		
		environment.setObjeto(objeto);
		environment.setSurface(surface);
		
		ObacControl obacControl = new ObacControl(environment);
		
//		if(configurationView.getComboBoxSupercie() == "plano"){
//			
//			new ObjectPlaneControl(obacControl, environment);
//		}
		
//		configurationView.getBtnInit().addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				
//				//environment.setGravidade(configurationView.getCombox());
//				
//			}
//		});
		
	}
	
	public boolean verificaCampos(){
		System.out.println(configurationView.getCbPropulsion().getSelectedItem().toString());
		//verifica se a propuls�o � "Manual" e se a velocidade inicial est� preenchida
		if(configurationView.getCbPropulsion().getSelectedItem().toString() == "Manual" &&
				configurationView.getTxVelocity().getText().equals("")){
			JOptionPane.showMessageDialog(obac, "Preencha o campo: Velocidade Inicial"); 
			return false;
		}
		return true;
		
	}
	
	public void addActionListeners(){
		
		configurationView.getButtonGroupPlane().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
				//e.getActionCommand()
				
			}
		});
		
		configurationView.getBtSimulation().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (verificaCampos() == true){

					if(configurationView.getCbPropulsion().getSelectedItem() == "Manual"){
						environment.getObjeto().setPropulsao(0);
						environment.getObjeto().setVelocidade(Integer.parseInt(configurationView.getTxVelocity().getText()));
					}
					else{
						environment.getObjeto().setPropulsao(1);
						environment.getObjeto().setVelocidade(0);
						//configurationView.getTxVelocity().setEditable(false);
					}
					
				}
				
				
			}
		});
		
		configurationView.getCbPropulsion().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(configurationView.getCbPropulsion().getSelectedItem() == "Mola"){
					configurationView.getTxVelocity().setEditable(false);
				}
				else
					configurationView.getTxVelocity().setEditable(true);
				
			}
		});
		
	}
	
}
