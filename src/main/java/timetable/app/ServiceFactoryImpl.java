package timetable.app;

import timetable.repositoryjpa.PersistenceFactory;
import timetable.service.ServiceFactory;
import timetable.service.TimetableManagementService;
import java.util.HashMap;

public class ServiceFactoryImpl implements ServiceFactory {
    private PersistenceFactory persistenceFactory;

    public ServiceFactoryImpl(PersistenceFactory persistenceFactory) {
        this.persistenceFactory = persistenceFactory;
    }

	public TimetableManagementService timetableManagementService() {
		// TODO Auto-generated method stub
		return null;
	}

    
  

}
