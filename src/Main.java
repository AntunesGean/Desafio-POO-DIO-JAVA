import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        /*
        Exemplo de polimorfismo
        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();
        */

        Curso curso3 = new Curso();
        curso3.setTitulo("Python");
        curso3.setDescricao("Curso de Python");
        curso3.setCargaHoraria(120);
//        System.out.println(curso3);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("JavaScript");
        mentoria2.setDescricao("Mentoria de JavaScript");
        mentoria2.setData(LocalDate.now());
//        System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria2);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-----");
        System.out.println("Conteúdos inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devCamila.getConteudosConcluidos());
        System.out.println("Total XP: " + devCamila.totalXp());

        System.out.println("\n------------------------ \n");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-----");
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("Total XP: " + devJoao.totalXp());

    }
}