import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "Curso de Java", 100);
        Curso curso2 = new Curso("JavaScript", "Curso de JavaScript", 80);

        Curso curso3 = new Curso();
        curso3.setNome("Python");
        curso3.setDescricao("Curso de Python");
        curso3.setCargaHoraria(120);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

        Mentoria mentoria1 = new Mentoria("Java", "Mentoria de Java", LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("JavaScript");
        mentoria2.setDescricao("Mentoria de JavaScript");
        mentoria2.setData(LocalDate.now());

        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}