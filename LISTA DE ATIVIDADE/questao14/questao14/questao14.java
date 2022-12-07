package questao14;

import java.util.ArrayList;

public class questao14 {
	 static String modelo; 
	 String memoria;
	 String armazenamento;
	 String processador;
	 String placaDeVideo;
	 ArrayList<questao14> listaQ14 = new ArrayList<>();
	
	/**
	 * @param modelo
	 * @param memoria
	 * @param armazenamento
	 * @param processador
	 * @param placaDeVideo
	 */
	public questao14(
			String modelo, 
			String memoria, 
			String armazenamento, 
			String processador, 
			String placaDeVideo) {
		modelo = modelo;
		this.memoria = memoria;
		this.armazenamento = armazenamento;
		this.processador = processador;
		this.placaDeVideo = placaDeVideo;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String args[]) {
	
	

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getPlacaDeVideo() {
		return placaDeVideo;
	}

	public void setPlacaDeVideo(String placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}

}
}