# Simple Bank Account System Software Design
 A simple Java program that represents a Bank Account System(ATM), complimented with a test case classes (BankTestDriver, BankTestOracle) Made as a assignment for one of the modules (CE202 - Software Engineering). The assignment's main goal was to work with the already provided code in Bank.java with a customer class that could be used to later on in the testing classes.
 
 Code Description: 

Bank.java

BankAccount() method passes the customer details and returns the final balance. The method mostly presents a ATM UI, allowing to do the most common transactions possible e.g. take out money, show balance, make a deposit.

BankTestDriver.java and BankTestOracle.java
The Customer class initializes a test profile to see if the system will act out accordingly to the expected behaviour, i.e. not allow to take out money if there is none in the balance, not deposit negative numbers, etc. The BankTestOracle would check if the given scenario will return the expected result.
 
BankTestDriver also provides a calculation of Probality of Failure on Demand (PODOF), with expectations to return a low rate. 

