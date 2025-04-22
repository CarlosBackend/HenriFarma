package HenriFarmas;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
public class VendaJPA {
   public static void inserir(Venda venda){
       EntityManager em = JPAConnect.conectar();
       
       try{
           em.getTransaction().begin();
           List<ItemVenda> itens = venda.getItens();
           if(itens!=null){
               for(ItemVenda item: itens){
                   item.setVenda(venda);
                   em.persist(venda);
               }
           }
           em.getTransaction().commit();
           System.out.println("Venda registrada com sucesso!");
       }catch(Exception e){
           em.getTransaction().rollback();
           System.out.println("Erro ao registrar venda: " + e.getMessage());
       }finally{
           em.close();
       }
   }
   public static List<Venda> listar(){
       EntityManager em = JPAConnect.conectar();
       List<Venda> vendas = new ArrayList<>();
       try{
           Query query = em.createQuery("SELECT v FROM venda v");
           vendas = query.getResultList();
       }catch (Exception e) {
            System.out.println("Erro ao listar vendas: " + e.getMessage());
        } finally {
            JPAConnect.desconectar();
        }
       return vendas;
   }
   public static void excluir(int id){
       EntityManager em = JPAConnect.conectar();
       try{
           Venda venda = em.find(Venda.class, id);
           if(venda !=null){
               em.getTransaction().begin();
               em.remove(venda);
               em.getTransaction().commit();
           }
       }catch(Exception ex){
           em.getTransaction().rollback();
           System.out.println("Erro ao excluir venda: " +ex.getMessage());
       }finally{
           em.close();
       }
   }
}
