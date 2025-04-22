package HenriFarmas;
import jakarta.persistence.*;
public class ItemVendaJPA {
    public static void inserir(ItemVenda item){
        EntityManager em = JPAConnect.conectar();
        try{
            em.getTransaction().begin();
            em.persist(item);
            em.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Erro ao inserir ItemVenda " + ex.getMessage());
        }finally{
            em.close();
        }
    }
}
