package HenriFarmas;
import HenriFarmas.JPAConnect;
import HenriFarmas.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoJPA {
    public static void cadastrarProduto(Produto p){
        EntityManager em = JPAConnect.conectar();
        try{
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        }catch(Exception e){
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Produto! " + e.getMessage());
        }finally{
            JPAConnect.desconectar();
        }
    }
    
    
    public static List<Produto> listar(){
        EntityManager em = JPAConnect.conectar();
        try{
            Query consulta = em.createQuery("SELECT p FROM Produto p", Funcionario.class);
            consulta.getResultList();
            List<Produto> lista = consulta.getResultList();
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
            Produto produto = em.find(Produto.class,id);
            if(produto !=null){
                em.getTransaction().begin();
                em.remove(produto);
                em.getTransaction().commit();
            }
        }catch(Exception ex){
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }
    public static void atualizar(Produto produto){
        EntityManager em = JPAConnect.conectar();
        try {
            em.getTransaction().begin();
            em.merge(produto); // merge atualiza o produto no banco
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Erro ao atualizar o produto: " + e.getMessage());
        } finally {
            em.close();
        }
    }
    public static List<Produto> buscarPorNome(String nome) {
    EntityManager em = JPAConnect.conectar();
    List<Produto> produtos = new ArrayList<>();
    try {
        produtos = em.createQuery("SELECT p FROM Produto p WHERE p.nome LIKE :nome", Produto.class).setParameter("nome", "%" + nome + "%").getResultList();
    } catch (Exception e) {
        return null;
    } finally {
        em.close();
    }
    return produtos;
   }
}


