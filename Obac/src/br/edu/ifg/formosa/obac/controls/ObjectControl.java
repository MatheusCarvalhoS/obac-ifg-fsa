package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.models.Surface;
import br.edu.ifg.formosa.obac.view.SurfaceView;

public class ObjectControl {
	
	private Environment environment;
	
	
	public ObjectControl(Environment environment){
		
		this.environment = environment;
		
	}
	
	public void calculaNormal(){
		//massa*9.8;
		environment.getObjeto().setForcaNormal((environment.getObjeto().getMassa() * environment.getGravidade()));
	}
	
	public void calculaAceleracao(){
		//(fat/massa)*(-1);
		environment.getObjeto().setAceleracao((
				environment.getSurface().getForcaAtrito()/
				environment.getObjeto().getMassa()) * -1);
	}
	
	public void calculaAceleracaoFall(){
		//(fat/massa)*(-1);
		environment.getObjeto().setAceleracao(environment.getGravidade());
	}
	
	public void calculaAceleracaoClimb(){
		//-ac = g*sen�+CoefA*g*cos� ;
		environment.getObjeto().setAceleracao((environment.getGravidade() * Math.sin(26.9) + environment.getSurface().getCoefFriction() *
				environment.getGravidade() * Math.cos(26.9)) * -1);
		System.out.println("Acelera��o subida:"+environment.getObjeto().getAceleracao());
	}
	
	public void calculaAceleracaoDescent(){
		//ac = g*sen�+CoefA*g*cos� ;
		environment.getObjeto().setAceleracao((environment.getGravidade() * Math.sin(26.9) + environment.getSurface().getCoefFriction() *
				environment.getGravidade() * Math.cos(26.9)));
		System.out.println("Acelera��o subida:"+environment.getObjeto().getAceleracao());
	}
	
	public void calculaPosicaoFinal(){
		//((velI*velI)*(-1))/(2*(ac));
		environment.getObjeto().setPosicaoFinal((((
				environment.getObjeto().getVelocidadeInicial()*
				environment.getObjeto().getVelocidadeInicial())*-1)/(2*(
						environment.getObjeto().getAceleracao()))));
	}
	
	public void calculaPosicaoFinalDescida(){
		//((velI*velI)*(-1))/(2*(ac));
		environment.getObjeto().setPosicaoFinal((((
				environment.getObjeto().getVelocidadeInicial()*
				environment.getObjeto().getVelocidadeInicial()))/(2*(
						environment.getObjeto().getAceleracao()))));
	}
	
	public void calculaPosicaoFinalPixel(){
		System.out.println("getPosicaoFinal: "+ environment.getObjeto().getPosicaoFinal());
		System.out.println("Escala: "+environment.getSurface().getEscala());
		environment.getObjeto().setPosicaoFinalPixel(environment.getObjeto().getPosicaoFinal()/environment.getSurface().getEscala());
		
	}
	
	public void calculaMomentoQueda(){
		
	}
	
	public void calculaTempo(){
		//(0 - velI)/ac;
		environment.getObjeto().setTempo((0-
				environment.getObjeto().getVelocidadeInicial())/
				environment.getObjeto().getAceleracao());
	}

	public boolean parada(){
		System.out.println("### PosicaoAtualPixel (parada): "+ environment.getObjeto().getPosicaoAtualPixel());
		System.out.println("### PosicaoFinalPixel (parada): "+ environment.getObjeto().getPosicaoFinalPixel());
		if(environment.getObjeto().getPosicaoAtualPixel() >= environment.getObjeto().getPosicaoFinalPixel())
			return true;
		else
			return false;
	}
	
	public boolean paradaCliff(){
		if(environment.getObjeto().getPosicaoAtualPixel() >= environment.getObjeto().getPosicaoFinalPixel()
				&& environment.getObjeto().getPosicaoAtualY()>=SurfaceView.poslinhaEscalaDown)
			return true;
		else
			return false;
	}
	
	public boolean paradaClimb(){
		environment.getSurface();
		if(environment.getObjeto().getPosicaoAtualPixel() >= Surface.getPontoFinalObjetoClimb()){
			return false;
			}
		else
			return true;
	}
	
	public boolean paradaDescent(){
		environment.getSurface();
		if(environment.getObjeto().getPosicaoAtualPixel() >= Surface.getPontoFinalObjetoDescent()){
			System.out.println("### posicaoAtualPixel (paradaDescent): " + environment.getObjeto().getPosicaoAtualPixel());
			System.out.println("###pontoFinalObjetoDescent (paradaDescent): " + Surface.getPontoFinalObjetoDescent());
			environment.getObjeto().setPosicaoAtualPixel(Surface.getPontoFinalObjetoDescent());
			System.out.println("### posicaoAtual (paradaDescent): " + environment.getObjeto().getPosicaoAtual());
			return true;
		}
		else{
			return false;
		}
	}
	
}
