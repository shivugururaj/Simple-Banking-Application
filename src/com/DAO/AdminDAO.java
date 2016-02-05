package com.DAO;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.classes.Account;
import com.classes.Address;
import com.classes.Cheque;
import com.classes.ChequeBook;
import com.classes.Customer;
import com.classes.UserAccount;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class AdminDAO extends HibernateDaoSupport implements IAdminDAO{
	
	public AdminDAO() {
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public UserAccount login(UserAccount ua) {		
		try {
			String username=ua.getUsername();
			String password=ua.getPassword();
			Query q=getSession().createQuery("from UserAccount u where u.username=? and u.password=?");
			q.setParameter(0, username);
			q.setParameter(1, password);
			
			UserAccount userAccount=(UserAccount)q.uniqueResult();
			System.out.println(userAccount);
			return userAccount;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	@Override
	public boolean createAccount(Address addr, Customer cust, Account ac,
			UserAccount ua) {
		try{			
			System.out.println(addr);	
			System.out.println(ac);
			getHibernateTemplate().save(ac);
		    getHibernateTemplate().save(ua);
			return true;
			}catch(Exception e){
				e.printStackTrace();
				return false;}
	
	}
	@Override
	public boolean linkAccount(String custId,String accno,String type,double balance) {
		try {
			
			Account ac=new Account();
			Customer cust=new Customer();
			Customer customer=(Customer)getHibernateTemplate().get(Customer.class, custId);
			ac.setAccountNo(accno);
			
			SimpleDateFormat sf=new SimpleDateFormat("yy-MM-dd");
			try {
				java.util.Date utilDate=new java.util.Date();
				Date date_of_account=new java.sql.Date(utilDate.getTime());		
				ac.setDateOfAccount(date_of_account);
			} catch (ParseException e) {
				
				e.printStackTrace();
			}		
			
			ac.setPrimaryCustId(customer);
			ac.setType(type);
			ac.setBalance(balance);
		//	Query q=  getSession().createQuery("from Account ac where ac.primaryCustId="+custId);			
		getHibernateTemplate().save(ac);
		
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	@Override
	public void status_cheque(String chequeno) {
		
		Query q= getSession().createQuery("from Cheque c where c.chequeNo=?");
		q.setParameter(0, chequeno);
		Cheque cheque=(Cheque) q.uniqueResult();	
		System.out.println(cheque.toString());
		cheque.setStatus("clear");			
		getHibernateTemplate().update(cheque);
		
		
		
	}
	public void status_chequebook(String chequeid) {
		
		
		System.out.println(chequeid);
		ChequeBook chequeBook=(ChequeBook) getHibernateTemplate().get(ChequeBook.class, chequeid);
		SimpleDateFormat sf=new SimpleDateFormat("yy-MM-dd");
		try {
			java.util.Date utilDate=new java.util.Date();
			Date date_of_issue=new java.sql.Date(utilDate.getTime());		
			chequeBook.setDateOfIssue(date_of_issue);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}		
		
		chequeBook.setStatus("issued");			
		getHibernateTemplate().update(chequeBook);
		
		
		
	}
	@Override
	public List<Cheque> getAllCheque() {
		Query q= getSession().createQuery("from Cheque where status='not-clear'");
		List<Cheque> list_cheque=(List<Cheque>) q.list();
		return list_cheque;
	}
	@Override
	public List<ChequeBook> getAllChequeBook() {
		Query q= getSession().createQuery("from ChequeBook where status='not-issued'");
		List<ChequeBook> list_chequebook=(List<ChequeBook>) q.list();
		return list_chequebook;
	}
	


}
