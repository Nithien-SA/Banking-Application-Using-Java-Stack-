package service;

import java.sql.SQLException;

import dao.*;
import exception.InvalidAccountTypeException;
import model.Bank;

public class BankService {
		private BankDAO bankdao;
		
		public BankService() 
		{
			this.bankdao = new BankDAOImpl();
		}
		
		public Bank getBankId(int id) throws InvalidAccountTypeException, SQLException
		{
			return this.bankdao.getBankById(id);
		}
}