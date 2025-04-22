package HenriFarmas;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class ClienteJPA {
    public static void cadastrarCliente(Cliente cliente) {
        EntityManager em = JPAConnect.conectar();
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
        } finally {
            JPAConnect.desconectar();
        }
    }
    public static List<Cliente> listarClientes() {
        EntityManager em = JPAConnect.conectar();
        List<Cliente> clientes = null;
        try {
            Query query = em.createQuery("SELECT c FROM cliente c");
            clientes = query.getResultList();
        } catch (Exception e) {
            System.out.println("Erro ao listar clientes: " + e.getMessage());
        } finally {
            JPAConnect.desconectar();
        }
        return clientes;
    }
    public static void removerCliente(int id) {
        EntityManager em = JPAConnect.conectar();
        try {
            em.getTransaction().begin();
            Cliente cliente = em.find(Cliente.class, id);
            if (cliente != null) {
                em.remove(cliente);
                em.getTransaction().commit();
            } else {
                System.out.println("Cliente não encontrado para remoção.");
                em.getTransaction().rollback();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Erro ao remover cliente: " + e.getMessage());
        } finally {
            JPAConnect.desconectar();
        }
    }
        public static List<Cliente> buscarPorNome(String nome) {
    EntityManager em = JPAConnect.conectar();
    List<Cliente> cliente = new ArrayList<>();
    try {
        cliente = em.createQuery("SELECT c FROM cliente c WHERE c.nome LIKE :nome", Cliente.class).setParameter("nome", "%" + nome + "%").getResultList();
    } catch (Exception e) {
        return null;
    } finally {
        em.close();
    }
    return cliente;
   }
    public static Cliente buscarNome(String nome) {
    EntityManager em = JPAConnect.conectar();
    Cliente cliente = null;
    try {
        Query query = em.createQuery("SELECT c FROM cliente c WHERE c.nome = :nome");
        query.setParameter("nome", nome.toLowerCase());
        List<Cliente> resultados = query.getResultList();
        if (!resultados.isEmpty()) {
            cliente = resultados.get(0); // pega o primeiro da lista
        }
    } catch (Exception e) {
        System.out.println("Erro ao buscar cliente: " + e.getMessage());
    } finally {
        em.close();
    }
    return cliente;
    }
    public static void editar(Cliente cliente) {
    EntityManager em = JPAConnect.conectar();
    try {
        em.getTransaction().begin(); 
        em.merge(cliente); 
        em.getTransaction().commit(); 
    } catch (Exception e) {
        em.getTransaction().rollback(); 
        System.out.println("Erro ao editar cliente: " + e.getMessage());
    } finally {
        em.close(); 
    }
   }
}
