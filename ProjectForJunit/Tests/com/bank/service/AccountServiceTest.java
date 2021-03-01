package com.bank.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountServiceTest {

	@Test
	void createNewAccount_Must_Return_Valid_Id_When_Balance_GTEO_Min_Bal() {
		//rythmn for unit testing is called AAA
		//AAA is Arrange Act Assert
		// arrange make necceesary arrangmnt fro testing
		//act actal testing happening , perfomr the action.
		//asseet verfiy the result is as expectd or not
		
		
		//arrange
		AccountService objUnderTest= new AccountService();
		String type ="sa";
		double balance= objUnderTest.MIN_BAL+1;
		
		//
		int result=objUnderTest.createNewAccount(type,balance);
		
//		if(result>0)
//		{
//			System.out.println("");
//		}
		//fail("Not yet implemented");
		assertTrue(result>0);
		//assertTr
	}
	  @Test
	 void createNewAccount_Must_Return_0_When_Balance_LT_Min_Bal() {
		  AccountService objUnderTest= new AccountService();
		  String type ="sa";
		  double balance= objUnderTest.MIN_BAL-1;
		  int result=objUnderTest.createNewAccount(type,balance);
		  assertTrue(result==0);
	 }

}
