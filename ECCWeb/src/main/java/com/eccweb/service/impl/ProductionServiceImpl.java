package com.eccweb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecc.core.dao.ProductionDao;
import com.ecc.core.entities.Production;
import com.ecc.core.services.ProductionService;
import com.ecc.core.services.exception.DoesNotExistException;
import com.ecc.core.services.util.ProductionList;
@Service
@Transactional
public class ProductionServiceImpl implements ProductionService {
	@Autowired
    private ProductionDao productionDao;

	@Override
	public ProductionList findAllProduction() {
		return new ProductionList(productionDao.findAllProduction());
	}

	@Override
	public Production findProduction(Long id) {
		return productionDao.findProduction(id);
	}

	@Override
	public Production createProduction(Production data) {
		return productionDao.createProduction(data);
	}

	@Override
	public Production updateProduction(Production data) {
		Production saveData = productionDao.findProduction(data.getId());
		if(saveData == null)
        {
            throw new DoesNotExistException();
        }
		saveData.setMachine(data.getMachine());
		saveData.setNoOfJobs(data.getNoOfJobs());
		saveData.setNoOfWorkers(data.getNoOfWorkers());
		saveData.setPowerConception(data.getPowerConception());
		saveData.setServiceEngineer(data.getServiceEngineer());
		return productionDao.updateProduction(saveData);
	}

	@Override
	public void deleteProduction(Long id) {
		Production prod = productionDao.findProduction(id);
        if(prod == null)
        {
            throw new DoesNotExistException();
        }
        productionDao.deleteProduction(prod);
	}

}
