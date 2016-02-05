package com.DAO;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.classes.Account;
import com.classes.Cheque;
import com.classes.ChequeBook;
import com.classes.Customer;
import com.classes.Transaction;
import com.classes.UserAccount;

public class CustomerDAO extends HibernateDaoSupport implements ICustomerDAO{

	@Override
	public boolean transaction(String toAccountNo, double amount,
			String paymentMode, String transactionDate, String fromAccount)
	{
		try {
			System.out.println(toAccountNo);
			System.out.println(fromAccount);
			Transaction transaction=new Transaction();
			Account toAccountNo_obj=null;
			Account fromAccount_obj=null;


			if (toAccountNo!="") {
				toAccountNo_obj=(Account) getSession().get(Account.class, toAccountNo);		

				System.out.println(toAccountNo_obj.toString());


				//Updating in Account table

				double newBalance=toAccountNo_obj.getBalance()+amount;


				toAccountNo_obj.setBalance(newBalance);


				getHibernateTemplate().update(toAccountNo_obj);


				System.out.println(toAccountNo_obj.toString());

			}

			if (fromAccount!="") {

				fromAccount_obj=(Account) getSession().get(Account.class, fromAccount);	
				System.out.println(fromAccount_obj.toString());
				//Updating in Account table

				double newBalance=fromAccount_obj.getBalance()-amount;
				System.out.println(newBalance);
				fromAccount_obj.setBalance(newBalance);
				getHibernateTemplate().update(fromAccount_obj);
				System.out.println(fromAccount_obj.toString());


			}


			java.sql.Date transactionDate_frmt=null;
			SimpleDateFormat sf=new SimpleDateFormat("yy-MM-dd");
			try {
				java.util.Date utilDate=sf.parse(transactionDate);
				transactionDate_frmt=new java.sql.Date(utilDate.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			transaction.setAmount(amount);
			transaction.setFromAccount(fromAccount_obj);

			transaction.setPaymentMode(paymentMode);
			transaction.setToAccountNo(toAccountNo_obj);
			transaction.setTransactionDate(transactionDate_frmt);
			System.out.println("trans obj:"+transaction.toString());

			getHibernateTemplate().save(transaction);			

			return true; 

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}


	}

	@Override
	public String login(UserAccount ua) {
		String username=ua.getUsername();
		String password=ua.getPassword();
		Query q=getSession().createQuery("from UserAccount u where u.username=? and u.password=?");
		q.setParameter(0, username);
		q.setParameter(1, password);

		UserAccount userAccount=(UserAccount)q.uniqueResult();
		System.out.println(userAccount);
		return userAccount.getRoleid();
	}

	@Override
	public boolean deposit(String toAccountNo, double amount,
			String paymentMode, java.sql.Date transactionDate, String fromAccount) {
		// TODO Auto-generated method stub
		try {
			System.out.println(toAccountNo);
			System.out.println(fromAccount);
			Transaction transaction=new Transaction();
			Account toAccountNo_obj=null;
			Account fromAccount_obj=null;


			if (toAccountNo!=null) {
				toAccountNo_obj=(Account) getSession().get(Account.class, toAccountNo);		

				System.out.println(toAccountNo_obj.toString());


				//Updating in Account table

				double newBalance=toAccountNo_obj.getBalance()+amount;


				toAccountNo_obj.setBalance(newBalance);


				getHibernateTemplate().update(toAccountNo_obj);


				System.out.println(toAccountNo_obj.toString());

			}
			if (fromAccount!=null) {

				fromAccount_obj=(Account) getSession().get(Account.class, fromAccount);	
				System.out.println(fromAccount_obj.toString());
				//Updating in Account table

				double newBalance=fromAccount_obj.getBalance()-amount;
				System.out.println(newBalance);
				fromAccount_obj.setBalance(newBalance);
				getHibernateTemplate().update(fromAccount_obj);
				System.out.println(fromAccount_obj.toString());


			}





			transaction.setAmount(amount);
			transaction.setFromAccount(fromAccount_obj);

			transaction.setPaymentMode(paymentMode);
			transaction.setToAccountNo(toAccountNo_obj);
			transaction.setTransactionDate(transactionDate);
			System.out.println("trans obj:"+transaction.toString());

			getHibernateTemplate().save(transaction);			

			return true; 

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}


	}

	@Override
	public boolean withdraw(String toAccountNo, double amount,
			String paymentMode, java.sql.Date transactionDate,
			String fromAccount) {
		// TODO Auto-generated method stub
		try {

			Transaction transaction=new Transaction();
			Account toAccountNo_obj=null;
			Account fromAccount_obj=null;


			if (toAccountNo!=null) {
				toAccountNo_obj=(Account) getSession().get(Account.class, toAccountNo);		

				//System.out.println(toAccountNo_obj.toString());


				//Updating in Account table

				//double newBalance=toAccountNo_obj.getBalance()+amount;


				//	toAccountNo_obj.setBalance(newBalance);


				//	getHibernateTemplate().update(toAccountNo_obj);

				//	
				//	System.out.println(toAccountNo_obj.toString());
				//
			}

			if (fromAccount!=null) {
				System.out.println("here");
				fromAccount_obj=(Account) getSession().get(Account.class, fromAccount);	
				//System.out.println(fromAccount_obj.toString());
				//Updating in Account table

				double newBalance=fromAccount_obj.getBalance()-amount;

				System.out.println(newBalance);


				fromAccount_obj.setBalance(newBalance);

				getHibernateTemplate().update(fromAccount_obj);


				System.out.println(fromAccount_obj.toString());


			}





			transaction.setAmount(amount);
			transaction.setFromAccount(fromAccount_obj);

			transaction.setPaymentMode(paymentMode);
			transaction.setToAccountNo(toAccountNo_obj);
			transaction.setTransactionDate(transactionDate);
			System.out.println("trans obj:"+transaction.toString());

			getHibernateTemplate().save(transaction);			

			return true; 

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}


	}

	@Override
	public double miniStatement(String accountNo) {

		Account a=(Account) getHibernateTemplate().get(Account.class,accountNo);      
		double x =a.getBalance();        
		System.out.println(x);
		return x;

	}

	@Override
	public List<Transaction> detailStatement(String startingDate,String endingDate,String fromAccount)
	{

		//Transaction t=(Transaction) getSession().get(Transaction.class,startingDate);
		Query q=null;


		try {
			SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yy");                        
			java.util.Date startingDate_=sf.parse(startingDate);
			//System.out.println(startingDate);
			Date startingDate_frmt=new java.sql.Date(startingDate_.getTime());
			System.out.println(startingDate_frmt);
			java.util.Date endingDate_=sf.parse(endingDate);
			Date endingDate_frmt=new java.sql.Date(endingDate_.getTime());
			System.out.println(endingDate_frmt);
			// Transaction t=(Transaction) getHibernateTemplate().get(Transaction.class,startingDate);
			Session s=getSession();

			String template="from Transaction t where t.fromAccount.accountNo=? or t.toAccountNo.accountNo=?  and  t.transactionDate>=? and t.transactionDate<=?";
			q=s.createQuery(template);
			q.setParameter(0,fromAccount);	
			q.setParameter(1,fromAccount);	

			q.setParameter(2,startingDate_frmt);
			q.setParameter(3,endingDate_frmt);		
			System.out.println(startingDate_frmt+"   "+endingDate_frmt);
			return q.list() ;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

		
	}

	@Override
	public List<Cheque> chequeStatus(String toAccountNo)

	{
		Query q=null;
		try
		{
			q= getSession().createQuery("from Cheque c where c.toaccountNo=?");
			q.setParameter(0, toAccountNo);
			Cheque cheque=(Cheque) q.uniqueResult();
			System.out.println(q.executeUpdate());
			

		} catch (Exception e) {
			
			e.printStackTrace();

		}

		return q.list();
	}
	@Override
	public boolean chequeBookRequest(String accountNo,String status)

	{	
		try {
			Account account=(Account)getHibernateTemplate().get(Account.class, accountNo);
			ChequeBook chequeBook=new ChequeBook();
			chequeBook.setAccountNo(account);
			
			//Fetching current date
			
			
			Calendar cal = Calendar.getInstance();
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");
	        String strDate = sdf.format(cal.getTime());
	        SimpleDateFormat sdf1 = new SimpleDateFormat();
	        sdf1.applyPattern("yy/mm/dd");
	        java.util.Date date = new java.util.Date();
	        Date dateOfIssue= new java.sql.Date(date.getTime());
			
			chequeBook.setDateOfIssue(dateOfIssue);
			chequeBook.setStatus(status);
			
			getHibernateTemplate().save(chequeBook);
			return true;
		} catch (Exception e) {
			return false;
		}
		
		
	}

	@Override
	public List<Account> getAccountDetails(UserAccount ua) {
		String custId=ua.getPrimaryCustId().getCustId();
		System.out.println(custId);
		Query q= getSession().createQuery("from Account ac where ac.primaryCustId.custId=?");
		q.setParameter(0, custId);
		List<Account> account=(List<Account>) q.list();
		System.out.println(account);
		return account;
	}

	@Override
	public boolean updatePassword(String password, String custId) {
		Query q= getSession().createQuery("from UserAccount ua set ua.password=? where ua.primaryCustId.custId=?");
	    q.setParameter(0, password);
	    q.setParameter(1,custId);
	    q.executeUpdate();	
	    if(q!=null)
			
			return true;
		else
			return false;

	}

	@Override
	public List<Account> viewDetails(String custId) {
		System.out.println("viewDetails"+custId);
		Query q=getSession().createQuery("from Account a where a.primaryCustId.custId=?");
		q.setParameter(0,custId);
		//q.setParameter(1,addressId);
		System.out.println(q.list());
		//System.out.println(c);
        return q.list();
		//return custId;
		
		
	}
	public String generateInternetBankingPin(UserAccount ua)	{
		System.out.println("generateInternetBankingPin"+ua.getPrimaryCustId().getCustId());
		String custId=ua.getPrimaryCustId().getCustId();
		System.out.println(custId);
		Customer customer=(Customer) getHibernateTemplate().get(Customer.class,custId );
		System.out.println(customer.getCustId());
		
		String internetBankingPin=customer.getFirstName().substring(0, customer.getFirstName().length()-1).concat("."+customer.getSurName().substring(0, customer.getSecondName().length()-1)+"@inb.com");
		System.out.println("internetBankingPin"+internetBankingPin);
		return internetBankingPin;
	}



}
