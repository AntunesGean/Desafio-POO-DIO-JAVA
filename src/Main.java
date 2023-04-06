import br.com.dio.desafio.dominio.Curso;
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
        System.out.println(curso3);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("JavaScript");
        mentoria2.setDescricao("Mentoria de JavaScript");
        mentoria2.setData(LocalDate.now());

        System.out.println(mentoria2);
    }
}