package HenriFarmas;
import jakarta.persistence.*;
@Entity(name="itens_venda")
public class ItemVenda {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Column(name="quantidade")
    private int quantidade;
    @Column(name="preco_unitario")
    private double precoUnitario;
    
    @ManyToOne
    @JoinColumn(name="venda_id")
    private Venda venda;
    
    @ManyToOne
    @JoinColumn(name="produto_id")
    private Produto produto;

    public ItemVenda() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
