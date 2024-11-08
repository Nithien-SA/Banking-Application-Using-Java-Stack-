package dao;

import java.sql.SQLException;

import exception.InvalidAccountTypeException;
import model.Bank;

public interface BankDAO 
{

	Bank getBankById(int Id) throws InvalidAccountTypeException, SQLException;
	
}
