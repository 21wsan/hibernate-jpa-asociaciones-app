package org.wsan.hibernateapp;

import jakarta.persistence.EntityManager;
import org.wsan.hibernateapp.entity.Cliente;
import org.wsan.hibernateapp.entity.Factura;
import org.wsan.hibernateapp.util.JpaUtil;

public class HibernateAsociacionesManyToOneFind {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();//paso inicial para realizar cualquier operacion de DB usando JPA

        try{
            em.getTransaction().begin();
            Cliente cliente = em.find(Cliente.class, 1L);

            //Objeto factura
            Factura factura = new Factura("compras de oficina", 1000L);
            factura.setCliente(cliente);
            em.persist(factura);

            System.out.println(factura.getCliente());
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            em.close();
        }

    }
}
