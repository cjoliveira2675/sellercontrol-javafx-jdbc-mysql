package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Departamento;

public class DepartamentoService {

	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Departamento> findAll(){
		return dao.findAll();
	}
	
	public void saveOrUpdate(Departamento depto) {
		if (depto.getCodigo() == null) {
			dao.insert(depto);
		}
		else {
			dao.update(depto);
		}
	}
	
	public void remove(Departamento obj) {
		dao.deleteById(obj.getCodigo());
	}
	
	public List<Departamento> findByPiece(String str) {
		return dao.findByPiece(str);
	}
	
}
