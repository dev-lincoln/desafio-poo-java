import com.desafio.dominio.Bootcamp;
import com.desafio.dominio.Curso;
import com.desafio.dominio.Dev;
import com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static <Dev> void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java Developer");
        curso1.setCargaHoraria(4);
                ;
        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript");
        curso2.setDescricao("Curso de Java Developer");
        curso2.setCargaHoraria(3);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Linkedin");
        mentoria.setDescricao("Mentoria sobre Linkedin");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Bootcamp de Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        com.desafio.dominio.Dev devLincoln = new com.desafio.dominio.Dev();
        devLincoln.setNome("Lincoln");
        devLincoln.inscreverBootcamp(bootcamp);
        System.out.println(devLincoln.getConteudosInscritos());
        System.out.println(devLincoln.getConteudosConcluidos());
        devLincoln.progredir();
        devLincoln.progredir();
        devLincoln.progredir();
        System.out.println(devLincoln.getConteudosConcluidos());
        System.out.println(devLincoln.getConteudosInscritos());
        System.out.println(devLincoln.calcularTotalXp());



    }
}
