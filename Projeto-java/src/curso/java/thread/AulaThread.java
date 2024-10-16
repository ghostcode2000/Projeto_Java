package curso.java.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Thread processando em paralelo do envio do email
		Thread thereadEmail = new Thread(thread1);
		thereadEmail.start();
		/************************************************************************************/
		//Thread processando em paralelo do envio de nota fiscal
	/*ro executar em paralelo*/
		
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		//Fim do codigo em paralelo
		
		/*Codigo do sistema do osuario comtinua o fluxo de trabalho*/
		System.out.println("Chegou ao fim do código de teste de thread");
		//Fluxo do sistema, cadastro de venda, um emissão de nota fiscal,algo do tipo
		JOptionPane.showMessageDialog(null, "Sistema comtinua executando para o usuario");
		
		
		
		
		
		
		
		
	}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			//Executa o que agente quer
			
			for (int pos = 0; pos < 10;pos++) {
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//Da um tempo.
				/*Quero executar essa envio a com um tempo de parada,ou com um tempo determinado*/
				System.out.println("Executando alguma rotina,exemple envio de nota fiscal");
		}
	}
	};
	
	private static Runnable thread1 = new Runnable() {
		
	
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			 //Executa o que agente quer
			
			for (int pos = 0; pos < 10;pos++) {
				System.out.println("Executando alguma rotina,exemple envio de e-mail");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//Da um tempo.
				/*Quero executar essa envio a com um tempo de parada,ou com um tempo determinado*/
			
			}
		}
	
	
};
}

	



