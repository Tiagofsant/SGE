package sge;

import controller.AlunoDao;
import controller.FornecedorDao;
import controller.ProdutoDao;
import controller.ProfessorDao;
import controller.SecretariaDao;
import controller.ServidorDao;
import controller.Utilitario;
import java.text.ParseException;
import model.Aluno;
import model.Fornecedor;
import model.Produto;
import model.Professor;
import model.Secretaria;
import model.Servidor;


/**
 *
 * @author Tiago F. Santos 
 */
public class SGE {

    public static void main(String[] args) throws ParseException {

        // CRUD DA CLASSE ALUNO FUNCIONANDO CORRETAMENTE

        //  INSERIR ALUNO
        Aluno aluno = new Aluno();
        AlunoDao alun = new AlunoDao();
        Utilitario util = new Utilitario();

       /* aluno.setNome_aluno("Tiago");
        aluno.setSobrenome_aluno("Santos");
        aluno.setCpf_aluno(02600032120);
        aluno.setEndereco_aluno("Cristo Rei");
        aluno.setTelefone_aluno(33225313);
        aluno.setCadastro_aluno(util.FormataDataExibe("23/12/2016"));
        aluno.setRg_aluno(1506528);*/

        //alun.inserir(aluno);
         

         //  CONSULTAR ALUNO
         aluno.setIdAluno(1);
         aluno = alun.consultar(aluno);
         System.out.println(aluno.getNome_aluno());
         System.out.println(aluno.getSobrenome_aluno());
         System.out.println(aluno.getCpf_aluno());

        // DELETAR  ALUNO
        /*aluno.setIdAluno(5);
        alun.deletar(aluno);*/
       
        // Ele estâ buscando pelo id do CONSULTAR ALUNO.

        //ALTERAR ALUNO
       /* aluno.setNome_aluno("James");
         alun.alterar(aluno);





         /* //  INSERIR CURSO
         Curso cur = new Curso();
         CursoDao curs = new CursoDao();

         cur.setNome_curso("Informática");
         cur.setCarga_horaria_curso(3);

         curs.alterar(cur);
         curs.inserir(cur);
         //cur = curs.consultar(cur);

         //  INSERIR DISCIPLINA
         Disciplina dis = new Disciplina();
         DisciplinaDao disc = new DisciplinaDao();

         dis.setCarga_horaria(200);
         dis.setEmenta("Desenvolvimento de Sistemas");
         dis.setNome_disciplina("Informática");
         dis.setProfessor_idProfessor(1);

         disc.alterar(dis);
         disc.inserir(dis);
         // dis = disc.consultar(dis);

         //  INSERIR FORNECEDOR
         Fornecedor forn = new Fornecedor();
         FornecedorDao forne = new FornecedorDao();

         forn.setEndereco("Av Bela Vista Rua 1808 casa 4718");
         forn.setNome("Pedro Company");
         forn.setTelefone(33214795);

         forne.inserir(forn);
         forne.alterar(forn);
         //forn = forne.consultar(forn);

         //  INSERIR MATRIUCULA
         Matricula mat = new Matricula();
         MatriculaDao matr = new MatriculaDao();

         mat.setAluno_idAluno(1);
         mat.setCurso_idCurso(1);
         mat.setTurma_idTurma(1);
         mat.setTurno("matutino");

         matr.alterar(mat);
         matr.inserir(mat);
         // matr = matr.consultar(matr);

         //  INSERIR OCORRENCIA
         Ocorrencia oco = new Ocorrencia();
         OcorrenciaDao ocor = new OcorrenciaDao();

         oco.setAluno_idAluno(1);
         oco.setProfessor_idProfessor(1);
         oco.setTurma("3°A");

         // ocor.alterar(oco);
         ocor.inserir(oco);
         // oco = ocor.consultar(oco);

         //  INSERIR PRODUTO
         Produto prod = new Produto();
         ProdutoDao pro = new ProdutoDao();

         prod.setIdProduto(1);
         prod.setNome_produto("computador");
         prod.setPreco_produto(2000);
         prod.setQuantidade_produto(20);

         pro.alterar(prod);
         pro.inserir(prod);
         // pro = prod.consultar(pro);

         //  INSERIR PROFESSOR
         Professor prof = new Professor();
         ProfessorDao profe = new ProfessorDao();

         prof.setAulas_ministradas(120);
         prof.setCpf(00232142125);
         prof.setEmail("pedroprof.sge.com");
         prof.setEndereco("AV Curitiba Rua 1026 Casa 4269");
         prof.setHoras_ministradas(280);
         prof.setNome_professor("Pedro");
         prof.setRg(1597536);
         prof.setSobrenome_professor("Carvalho");
         prof.setTelefone(33223045);

         profe.alterar(prof);
         profe.inserir(prof);
         // prof = profe.consultar(prof);

         //  INSERIR SECRETÁRIA
         Secretaria sec = new Secretaria();
         SecretariaDao secr = new SecretariaDao();

         sec.setCpf(12345678d);
         sec.setEndereco("AV Major Amarante Casa 1259");
         sec.setNome_secretaria("Paula");
         sec.setProduto_idProduto(1);
         sec.setRg(1026587);
         sec.setSobrenome_secretaria(" Ramos");
         sec.setTelefone(33222148d);

         secr.alterar(sec);
         secr.inserir(sec);
         //  sec = secr.consultar(sec);

         //  INSERIR SERVIDOR
         Servidor ser = new Servidor();
         ServidorDao servi = new ServidorDao();

         ser.setCpf(03858954d);
         ser.setEndereco("Jorge Teixeira Casa 2598");
         ser.setNome_servidor("João");
         ser.setRg(12345687);
         ser.setSobrenome_servidor("Figueiredo");
         ser.setTelefone(99865431);
         ser.setTipo_serviço("Professor");

         servi.alterar(ser);
         servi.inserir(ser);
         // ser = servi.consultar(ser);

         //  INSERIR TURMA
         Turma tur = new Turma();
         TurmaDao turm = new TurmaDao();

         tur.setNome_turma("3° A ADS");
         tur.setDisciplina_idDisciplina(1);
         tur.setQuantidade_aluno(30);
         tur.setQuantidade_vagas(35);
         tur.setTurno("Matutino");

         turm.inserir(tur);
         turm.alterar(tur);
         //tur = turm.consultar(tur);
         */
    }
}
