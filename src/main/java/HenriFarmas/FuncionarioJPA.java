package HenriFarmas;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioJPA {
    public static Funcionario validarFuncionario(Funcionario f){
        EntityManager em = JPAConnect.conectar();
        try{
            Query consulta = em.createQuery("SELECT f FROM Funcionario f WHERE f.cpf = :cpf AND f.cpf = :senha");
            consulta.setParameter("cpf", f.getCpf());
            consulta.setParameter("senha", f.getCpf());
            List<Funcionario> listaFuncionario = consulta.getResultList();
            if(!listaFuncionario.isEmpty()){
                return listaFuncionario.get(0);
            }
        }catch(Exception e){
            em.getTransaction().rollback();
        }finally{
            JPAConnect.desconectar();
        }
        return null;
    }
    public static void cadastrarFuncionario(Funcionario f){
        EntityManager em = JPAConnect.conectar();
        try{
            em.getTransaction().begin();
            em.persist(f);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
        }catch(Exception e){
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionário! " + e.getMessage());
        }finally{
            JPAConnect.desconectar();
        }
    }
    public static List<Funcionario> listar(){
        EntityManager em = JPAConnect.conectar();
        try{
            Query consulta = em.createQuery("SELECT f FROM Funcionario f", Funcionario.class);
            consulta.getResultList();
            List<Funcionario> lista = consulta.getResultList();
            return lista;
        }catch(Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }finally{
            JPAConnect.desconectar();
        }
    }
    public static void excluir(int id){
        EntityManager em = JPAConnect.conectar();
        try{
            Funcionario fun = em.find(Funcionario.class, id);
            if(fun !=null){
                em.getTransaction().begin();
                em.remove(fun);
                em.getTransaction().commit();
            }
        }catch(Exception ex){
            em.getTransaction().rollback();
            System.out.println("Erro ao excluir funcionário: "+ ex.getMessage());
        }finally{
            em.close();
        }
    }
}
