package model.dao;

import model.dao.impl.SellerDaoImplJDBC;

public class DaoFactory {
	
	public static SellerDao creatSellerDao() {
		return new SellerDaoImplJDBC();
	}
}
