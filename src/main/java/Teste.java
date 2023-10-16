import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Teste {


    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");

    private static EntityManager em = emf.createEntityManager();


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        //INSERIR CLIENTE

        /* Cliente cliente = new Cliente();
        System.out.println("Digite o nome do cliente");
        cliente.setNome(scn.next());

        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit(); */

        //DELETAR CLIENTE

       /* System.out.println("Digite o id do cliente a ser excluido");

        Cliente cliente = em.find(Cliente.class, scn.nextInt());

        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
        */

        //ATUALIZAR CLIENTE

      /*  Cliente cliente = new Cliente();
        System.out.println("Informe o ID do cliente a ser atualizado");
        cliente.setId(scn.nextInt());
        System.out.println("Informe o novo nome do cliente");
        cliente.setNome(scn.next());

        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
        */

        //LISTAR CLIENTE

        Cliente cliente = em.find(Cliente.class, 1);
        System.out.println("Nome do cliente eh: "+ cliente.getNome());






    }
}
