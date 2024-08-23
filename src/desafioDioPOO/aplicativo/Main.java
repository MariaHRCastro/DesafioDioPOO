package desafioDioPOO.aplicativo;

import java.time.LocalDate;

import desafioDioPOO.dominio.Bootcamp;
import desafioDioPOO.dominio.Curso;
import desafioDioPOO.dominio.Dev;
import desafioDioPOO.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Curso de Java");
		curso1.setCargaHoraria(20);
		
		Mentoria curso2 = new Mentoria();
		curso2.setTitulo("Javascript");
		curso2.setDescricao("Curso de Javascript");
		curso2.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("descricao");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		
		Dev dev = new Dev();
		dev.setNome("Maria");
		dev.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos inscritos "+ dev.getNome()+": "+ dev.getConteudosInscritos());
		dev.progredir();
		System.out.println("Conteudos concluidos "+ dev.getNome()+" : "+dev.getConteudosConcluidos());
		System.out.println("Conteudos inscritos "+ dev.getNome()+ " :"+ dev.getConteudosInscritos());

		
		System.out.println("-------------------------------------------------------------------------");
		
		Dev dev1 = new Dev();
		dev1.setNome("João");
		dev1.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos inscritos "+ dev1.getNome()+": "+ dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("Conteudos concluidos "+ dev1.getNome()+" : "+dev1.getConteudosConcluidos());
		System.out.println("Conteudos inscritos "+ dev1.getNome()+ " :"+ dev1.getConteudosInscritos());
	}

}
