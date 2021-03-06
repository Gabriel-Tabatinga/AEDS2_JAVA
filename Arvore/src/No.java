
public class No {
	private Series item;
	private No esquerda;
	private No direita;
	private int nivel;
	
	public No() {
		
		item = new Series();
		esquerda = null;
		direita = null;
	}
	
	public No(Series registro) {
		
		item = registro;
		esquerda = null;
		direita = null;
	}
	
	public Series getItem() {
		return item;
	}
	public void setItem(Series item) {
		this.item = item;
	}
	
	public No getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
	
	public No getDireita() {
		return direita;
	}
	public void setDireita(No direita) {
		this.direita = direita;
	}
	
	public void setNivel() { //FUNCAO MATH.MAX VAI RETORNAR O MAIOR COMPARANDO ESQUERDA E DIREITA ATE ACHAR NULL
		this.nivel = 1 + Math.max(getNivel(getEsquerda()), getNivel(getDireita()));
	}

    public int getNivel(No no) {
		return (no == null) ? 0 : no.nivel;
	}
}
