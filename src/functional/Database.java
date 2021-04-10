package functional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**
 * The Database Class is the controller for managing the 
 * database for the program. This mostly consists of text
 * files for persistence.
 *
 * @author Nicholas Hartley
 */

public class Database {
	
  /**
   * An ArrayList of all Members currently in the system.
   */
	
  private ArrayList<Member> memberList; 
  
  /**
   * An ArrayList of all Providers currently in the system.
   */

  private ArrayList<Provider> providerList; 
  
  /**
   * Method to pick which database operation is being performed.
   */
  
  public void pickAction() {
	  
  } 

  /**
   * Default constructor for the Database class.
   */
  public Database() {
    memberList = new ArrayList<Member>();
    providerList = new ArrayList<Provider>();
  }
  
  /**
   * Returns a member object if member exists for database modifications.
   * 
   * @param memberNumber
   * @throws ArrayIndexOutOfBoundsException
   */
  
  public Member searchMember(int memberNumber) {
    int index = 0; 

    while (index <= memberList.size()) {
      Member temp = memberList.get(index);

      if (temp.getMemberNum() == memberNumber){
        return temp;
      } 
      else {
        index++;
      }
    }

    throw new ArrayIndexOutOfBoundsException();
  } 
  
  /**
   * Returns a provider object if member exists for database modifications.
   * 
   * @param providerNumber
   * @throws ArrayIndexOutOfBoundsException
   */
  
  public Provider searchProvider(int providerNumber) {
	  int index = 0; 
    while (index <= providerList.size()) {
      Provider temp = providerList.get(index);

      if (temp.getProviderNum() == providerNumber){
        return temp;
      } 
      else {
        index++;
      }
    }

    throw new ArrayIndexOutOfBoundsException();
  } 
  
  /**
   * Checks the memeber number to see if the member exists.
   */
  
  public boolean checkMemberNumber(int memberNumber) {
	  try {
      searchMember(memberNumber);
      return true;
    } catch (Exception e) {
      return false;
    }
  } 
  
  /**
   * Checks the provider number to see if the provider exists.
   */
  
  public boolean checkProviderNumber(int providerNumber) {
	  try {
      searchMember(providerNumber);
      return true;
    } catch (Exception e) {
      return false;
    }
  } 
  
  /**
   * Finds member from member number and returns the standing of that member.
   */
  
  public String checkmemberStanding(int memberNumber) {
    try {
      if(searchMember(memberNumber).getStatus()){
        return "Validated";
      } else {
        return "Member suspended";
      }
    } catch (Exception e) {
      return "Invalid number";
    }
  } 
  
  /**
   * Gets a subset of the providers consisting of the providers who are owed money.
   */
  
  public ArrayList<Provider> getProvidersOwed() {
    Iterator<Provider> iterator = providerList.iterator();
    ArrayList<Provider> temp = new ArrayList<Provider>();
    Provider current;

    while(iterator.hasNext()){
      current = iterator.next();
      if(current.getStatus()){
        temp.add(current);
      } else {
        //Don't do anything
      }
    }
    return temp;
  }
  
  // These are gonna be in a different file probably, but they're here for now
  
  /**
   * Gets a subset of the providers consisting of the providers who are owed money.
   */
  public void addMember() {
	  Member newMember = new Member();
	  newMember.createProfile();
    memberList.add(newMember);

  }
  
  /**
   * Gets a subset of the providers consisting of the providers who are owed money.
   */
  public void deleteMember() {
	int number;
	
	Scanner scanner = new Scanner(System.in);
    System.out.println("Enter member's member number: ");
	number = Integer.parseInt(scanner.nextLine());
	scanner.close();
      
    try {
      Member temp = searchMember(number);
      memberList.remove(temp);
    } catch (Exception e) {
      //TODO: handle exception
    }
	
  }
  
  /**
   * Gets a subset of the providers consisting of the providers who are owed money.
   */
  public void updateMember() {
	int number;
	
	Scanner scanner = new Scanner(System.in);
    System.out.println("Enter member's member number: ");
	number = Integer.parseInt(scanner.nextLine());
	scanner.close();
    
    try {
      Member temp = searchMember(number);
      //Add the UI for updating any given element
    } catch (Exception e) {
      //TODO: handle exception
    }
		
  }
  
  /**
   * Gets a subset of the providers consisting of the providers who are owed money.
   */
  public void addProvider() {
	  Provider newProvider = new Provider();
	  newProvider.createProfile();
    providerList.add(newProvider);

  }
  
  /**
   * Gets a subset of the providers consisting of the providers who are owed money.
   */
  public void deleteProvider() {
	int number;
	
	Scanner scanner = new Scanner(System.in);
    System.out.println("Enter provider's provider number: ");
	number = Integer.parseInt(scanner.nextLine());
	scanner.close();
    
    try {
      Provider temp = searchProvider(number);
      providerList.remove(temp);
    } catch (Exception e) {
      //TODO: handle exception
    }
		
  }
  
  /**
   * Gets a subset of the providers consisting of the providers who are owed money.
   */
  public void updateProvider() {
	int number;
	
	Scanner scanner = new Scanner(System.in);
    System.out.println("Enter provider's provider number: ");
	number = Integer.parseInt(scanner.nextLine());
	scanner.close();
    
    try {
      Provider temp = searchProvider(number);
      //Add the UI for updating any given element
    } catch (Exception e) {
      //TODO: handle exception
    }
		
  }

  /**
   * Gets a subset of the providers consisting of the providers who are owed money.
   */
  public ArrayList<Member> getMemberList() {
    return memberList;
  }

  /**
   * Gets a subset of the providers consisting of the providers who are owed money.
   */
  public ArrayList<Provider> getProviderList() {
    return providerList;
  }

}