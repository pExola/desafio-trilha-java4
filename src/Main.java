
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKauan = new Dev();
        devKauan.setNome("Kauan");
        devKauan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Kauan:" + devKauan.getConteudosInscritos());
        devKauan.progredir();
        devKauan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Kauan:" + devKauan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Kauan:" + devKauan.getConteudosConcluidos());
        System.out.println("XP:" + devKauan.calcularTotalXp());

        System.out.println("-------");

        Dev devSabrina = new Dev();
        devSabrina.setNome("Sabrina");
        devSabrina.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Sabrina:" + devSabrina.getConteudosInscritos());
        devSabrina.progredir();
        devSabrina.progredir();
        devSabrina.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Sabrina:" + devSabrina.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Sabrina:" + devSabrina.getConteudosConcluidos());
        System.out.println("XP:" + devSabrina.calcularTotalXp());

    }

}