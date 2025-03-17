package sets.tarefa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Exec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Aluno> alunos = new HashSet<>();
        Set<Curso> cursos = new HashSet<>();
        Set<Professor> professores = new HashSet<>();

        System.out.println("Temos as seguintes opções:\n" +
                "a: cadastrar aluno\n" +
                "c: cadastrar curso\n" +
                "p: cadastrar professores\n" +
                "A: listar todos os alunos da plataforma\n" +
                "C: listar todos os cursos da plataforma\n" +
                "P: listar todos os professores da plataforma\n" +
                "u: listar todos os cursos por aluno\n" +
                "l: listar todos os alunos por curso\n" +
                "f: listar todos os cursos por professor\n" +
                "n: listar todos os alunos por professor\n" +
                "d: adicionar aluno a um curso\n" +
                "r: remover aluno do curso\n" +
                "E: sair");

        while (true){
            System.out.print("Opção: ");
            char op = sc.next().charAt(0);

            switch (op) {
                case 'a':
                    System.out.print("Nome do aluno: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    alunos.add(new Aluno(nome));
                    break;

                case 'c':
                    System.out.print("Nome do curso: ");
                    sc.nextLine();
                    String curso = sc.nextLine();

                    System.out.print("Nome do professor: ");
                    String nomeProf = sc.nextLine();

                    Professor prof = professores.stream()
                            .filter(p -> p.getNome().equalsIgnoreCase(nomeProf))
                            .findFirst()
                            .orElse(null);

                    cursos.add(new Curso(curso, prof));
                    break;

                case 'p':
                    System.out.print("Nome do professor: ");
                    sc.nextLine();
                    nomeProf = sc.nextLine();
                    professores.add(new Professor(nomeProf));
                    break;

                case 'A':
                    System.out.println("Alunos da plataforma {");
                    alunos.forEach(System.out::println);
                    System.out.println("}");
                    System.out.println("Total de " + alunos.size() + " alunos");
                    break;

                case 'C':
                    System.out.println("Cursos da plataforma {");
                    cursos.forEach(System.out::println);
                    System.out.println("}");
                    System.out.println("Total de " + cursos.size() + " cursos");
                    break;

                case 'P':
                    System.out.println("Professores da plataforma {");
                    professores.forEach(System.out::println);
                    System.out.println("}");
                    System.out.println("Total de " + professores.size() + " professores");
                    break;

                case 'u':
                    System.out.print("Qual o id do aluno: ");
                    int idAluno = sc.nextInt();

                    alunos.stream()
                            .filter(a -> a.getId() == idAluno)
                            .findFirst()
                            .ifPresent(a -> {
                                String resultado = "aluno " + a.getNome() + " {\n" +
                                        a.listCourses().stream()
                                                .map(Curso::toString)
                                                .collect(Collectors.joining(",\n")) +
                                        "\n}";
                                System.out.println(resultado);
                            });
                    break;

                case 'l':
                    System.out.print("Qual o id do curso: ");
                    int idCurso = sc.nextInt();

                    cursos.stream()
                            .filter(c -> c.getId() == idCurso)
                            .findFirst()
                            .ifPresent(c -> {
                                String resultado = c.getNome() + ": aluno {\n" +
                                        c.listStudent().stream()
                                                .map(Aluno::toString)
                                                .collect(Collectors.joining(",\n")) +
                                        "\n}";
                                System.out.println(resultado);
                            });
                    break;

                case 'f':
                    System.out.print("Nome do professor: ");
                    sc.nextLine();
                    nomeProf = sc.nextLine();

                    professores.stream()
                            .filter(p -> p.getNome().equalsIgnoreCase(nomeProf))
                            .findFirst()
                            .ifPresent(p -> {
                                // Verificando se o professor tem cursos
                                if (p.listCourses().isEmpty()) {
                                    System.out.println(p.getNome() + " não está ministrando nenhum curso.");
                                } else {
                                    String resultado = p.getNome() + " {\n" +
                                            p.listCourses().stream()
                                                    .map(Curso::toString)
                                                    .collect(Collectors.joining(",\n")) +
                                            "\n}";
                                    System.out.println(resultado);
                                }
                            });

                    break;


                case 'n':
                    System.out.print("Nome do professor: ");
                    sc.nextLine();
                    nomeProf = sc.nextLine();

                    professores.stream()
                            .filter(p -> p.getNome().equalsIgnoreCase(nomeProf))
                            .findFirst()
                            .ifPresent(p -> {
                                // Obtendo todos os alunos únicos dos cursos do professor
                                Set<Aluno> alunosUnicos = p.listCourses().stream()
                                        .flatMap(cur -> cur.listStudent().stream())
                                        .collect(Collectors.toSet());

                                // Construindo a saída formatada
                                String resultado = p.getNome() + ", alunos {\n" +
                                        alunosUnicos.stream()
                                                .map(Aluno::toString)
                                                .collect(Collectors.joining(",\n")) +
                                        "\n}\nTotal de alunos: " + alunosUnicos.size();

                                System.out.println(resultado);
                            });

                    break;

                case 'd':
                    System.out.print("Qual o id do aluno: ");
                    idAluno = sc.nextInt();
                    System.out.print("Qual o id do curso: ");
                    idCurso = sc.nextInt();

                    Curso cur = cursos.stream()
                            .filter(c -> c.getId() == idCurso)
                            .findFirst()
                            .orElse(null);

                    alunos.stream()
                            .filter(a -> a.getId() == idAluno)
                            .findFirst()
                            .ifPresent(a -> a.registerForTheCouse(cur));
                    break;

                case 'r':
                    System.out.print("Qual o id do aluno: ");
                    idAluno = sc.nextInt();
                    System.out.print("Qual o id do curso: ");
                    idCurso = sc.nextInt();

                    Curso curs = cursos.stream()
                            .filter(c -> c.getId() == idCurso)
                            .findFirst()
                            .orElse(null);

                    alunos.stream()
                            .filter(a -> a.getId() == idAluno)
                            .findFirst()
                            .ifPresent(a -> a.leaveTheCourse(curs));
                    break;

                case 'E':
                    System.out.println("Tchau!");
                    return;
                default:
                    System.out.println("Comando inválido");
                    break;
            }
        }

    }
}
