package model.dao;

import javax.persistence.EntityManager;

import model.manager.EMF;
import model.vo.Actividad;
import model.vo.Usuario;

public class ActiviDao {

	public EntityManager em = null;

	public boolean insertObject(Actividad p) {

		try {
			em = EMF.get().createEntityManager();
			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();
			em.refresh(p);
			em.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (em != null && em.isOpen())
				em.close();

		}
	}

	public void findObject(Actividad p) {

		try {
			em = EMF.get().createEntityManager();
			em.getTransaction().begin();
			em.find(Usuario.class, p.getNombre());
			em.getTransaction().commit();
			em.refresh(p);
			em.close();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (em != null && em.isOpen())
				em.close();

		}

	}

}
