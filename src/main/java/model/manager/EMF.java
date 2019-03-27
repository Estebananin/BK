package model.manager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author esteban_lopez
 */

public final class EMF {
	
	private static EntityManagerFactory emfInstance;
        private static final String Selfplan = "Selfplan";
	
	public static EntityManagerFactory get() {
            if (emfInstance == null) {
                emfInstance = Persistence.createEntityManagerFactory(Selfplan);
            }
            
            return emfInstance;
	}

        public static void shutdown(){
            if (emfInstance != null) {
                emfInstance.close();
            }
        }
        
        
}