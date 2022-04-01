import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descri��o curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descri��o JS");
		curso2.setCargaHoraria(6);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria java");
		mentoria.setDescricao("Descri��o java");
		mentoria.setData(LocalDate.now());

		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Bootcamp Descir��o Java Developer.");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devJose = new Dev();
		devJose.setNome("Jose");
		devJose.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Jose " + devJose.getConteudosInscritos());
		devJose.progredir();
		System.out.println("Conteudos inscritos Jose " + devJose.getConteudosInscritos());
		System.out.println("Conteudos concluidos Jose " + devJose.getConteudosConcluidos());
		System.out.println("XP: " + devJose.calcularTotalXP());
		
		Dev devCarlos = new Dev();
		devCarlos.setNome("Carlos");
		devCarlos.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Carlos " + devCarlos.getConteudosInscritos());
		devCarlos.progredir();
		System.out.println("Conteudos concluidos Carlos " + devCarlos.getConteudosConcluidos());
		System.out.println("XP: " + devCarlos.calcularTotalXP());
		
	}

}
