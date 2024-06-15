import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição js");
        curso2.setCargaHoraria(4);

     

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev camila = new Dev();
        camila.setNome("Camila");
        camila.inscreverBoot(bootcamp);
        System.out.println("Conteudos inscritos: " +camila.getConteudosInscritos());

        camila.progredir();

        System.out.println("-");
        System.out.println("Conteudos inscritos: " +camila.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " +camila.getConteudosConcluidos());
        System.out.println("XP: " +camila.calcularTotalXP());

        System.out.println("--------");

        Dev joao = new Dev();
        joao.setNome("João");
        joao.inscreverBoot(bootcamp);
        System.out.println("Conteudos inscritos: " +joao.getConteudosInscritos());
        
        joao.progredir();
        joao.progredir();
        joao.progredir();

        System.out.println("-");
        System.out.println("Conteudos inscritos: " +joao.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " +joao.getConteudosConcluidos());
        System.out.println("XP: " +joao.calcularTotalXP());
    }
}
