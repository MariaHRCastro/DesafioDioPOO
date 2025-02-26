package desafioDioPOO.dominio;

public class Curso extends Conteudo{

	
	private int cargaHoraria;
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}
	
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
	
	
}
