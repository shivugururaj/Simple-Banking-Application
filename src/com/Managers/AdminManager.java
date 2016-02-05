package com.Managers;

import java.util.List;

import com.DAO.IAdminDAO;
import com.classes.Account;
import com.classes.Address;
import com.classes.Cheque;
import com.classes.ChequeBook;
import com.classes.Customer;
import com.classes.UserAccount;



public class AdminManager implements IAdminManager{
	private IAdminDAO adminDao;

	
	public IAdminDAO getAdminDao() {
		return adminDao;
	}


	public void setAdminDao(IAdminDAO adminDao) {
		this.adminDao = adminDao;
	}


	public UserAccount login(String username, String password) {		
		try {
			UserAccount ua=new UserAccount();
			ua.setUsername(username);
			ua.setPassword(password);		 
			return adminDao.login(ua);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public boolean createAccount(Address addr, Customer cust, Account ac,
			UserAccount ua) {
		try{	
			
			return adminDao.createAccount(addr, cust, ac, ua);
			}catch(Exception e){
				e.printStackTrace();
				return false;}
	
	}


	@Override
	public boolean linkAccount(String custId,String accno,String type,double balance)  {
		return adminDao.linkAccount(custId, accno, type, balance);
	}


	@Override
	public void status_cheque(String chequeno) {
		 adminDao.status_cheque(chequeno);
		
	}


	@Override
	public void status_chequebook(String chequeid) {
		adminDao.status_chequebook(chequeid);
		
	}


	@Override
	public List<Cheque> getAllCheque() {
		
		return adminDao.getAllCheque();
	}
	@Override
	public List<ChequeBook> getAllChequeBook() {
		
		return adminDao.getAllChequeBook();
	}
	
	
}
