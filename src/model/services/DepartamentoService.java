package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Departamento;

public class DepartamentoService {

	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Departamento> findAll(){
		/*List<Departamento> list = new ArrayList<>();
		list.add(new Departamento(1,"ABC"));
		list.add(new Departamento(2,"DEF"));
		list.add(new Departamento(3,"GHI"));
		return list;*/
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
	
	public Departamento findByPiece(Departamento obj) {
		return dao.findById(obj.getCodigo());
	}
	
}
