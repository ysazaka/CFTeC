/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author alexandrelerario
 */
public class CrudCidade extends AbstractCrud<br.data.entity.Cidade> {

    private EntityManager em;

    private static final String PU = EMNames.EMN1;

    public CrudCidade() {
        super(br.data.entity.Cidade.class);
    }

    public List<br.data.entity.Cidade> SelectByNome(String nome) {
        try {
            return getEntityManager().createNamedQuery("Teste.findByNome").setParameter("nome", "%" + nome.toUpperCase() + "%").getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }

}
