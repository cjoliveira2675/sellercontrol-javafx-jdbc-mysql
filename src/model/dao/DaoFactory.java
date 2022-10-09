package model.dao;

import db.DB;

public class DaoFactory {
	
	/*public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConn());
	}*/
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConn());
	}
	
	public static FilialDao createFilialDao() {
		return new FilialDaoJDBC(DB.getConn());
	}
}
