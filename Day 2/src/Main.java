import java.io.IOException;

import java.sql.SQLException;

import controller.BankController;
import exception.*;

public class Main 
{
      public static void main(String[] args) throws NumberFormatException, IOException, SQLException, BankingException, InvalidAccountTypeException 
      {
    	  BankController bc = new BankController();
    	  bc.start();
      }
}