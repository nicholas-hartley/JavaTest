package functional;

import java.util.Scanner;

/**
 * The Member class is an entity class. It contains and
 * maintains the profiles of ChocAn members.
 * 
 * @author Kaylee Chase
 */

public class Member {
	
  /**
   * The member's full name.
   */
	
  private String name; 
  
  /**
   * The member's member number.
   */
	
  private int memberNumber; 
  
  /**
   * The member's street address.
   */
	
  private String address;
  
  /**
   * The member's city.
   */
	
  private String city;
  
  /**
   * The member's state.
   */
	
  private String state;
  
  /**
   * The member's ZIP code.
   */
	
  private int zip; 
  
  /**
   * Boolean to represent if the member is in good standing.
   */
	
  private boolean status;

  /**
   * Blank constructor. Represents an empty member object.
   */

  public Member() {
	  
  }
  
  /**
   * uses LUI prompts user to enter the member's name
   */

   private void enterName() {
      Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter member's full name: ");
	  name = scanner.nextLine();
	  scanner.close();
  }
  
  /**
   * uses LUI promts to enter the member's member number.
   */
  private void enterMemberNum() {
    Scanner scanner = new Scanner(System.in);
	System.out.println("Enter member's member number: ");
	memberNumber = Integer.parseInt(scanner.nextLine());
	scanner.close();
  }
  
  /**
   * uses LUI promts to enter the member's street address.
   */
  private void enterAddress() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter member's street address: ");
	  address = scanner.nextLine();
	  scanner.close();
  }
  
  /**
   * uses LUI promts to enter the member's city.
   */
  private void enterCity() {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter member's city: ");
	  city = scanner.nextLine();
	  scanner.close();
  }
  
  /**
   * uses LUI promts to enter the member's state.
   */
  private void enterState() {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter member's state: ");
	  state = scanner.nextLine();
	  scanner.close();
  }
  
  /**
   * uses LUI promts to enter the member's ZIP code.
   */
  private void enterZip() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter member's ZIP code: ");
	zip = Integer.parseInt(scanner.nextLine());
	scanner.close();
  }

  /**
   * Fills in the member profile by calling functions
   * that use command line prompts.
   */ 
  public void createProfile() {
	  enterName();
	  enterMemberNum();
	  enterAddress();
	  enterCity();
	  enterState();
	  enterZip();
    status = true;  
  }
  
  /**
   * Returns member's full name.
   */
  public String getName() {
	  return name;
  }
  
  /**
   * Returns member's member number.
   */
  public int getMemberNum() {
	  return memberNumber;
  }
  
  /**
   * Returns member's street address.
   */
  public String getAddress() {
	  return address;
  }
  
  /**
   * Returns member's city.
   */
  public String getCity() {
	  return city;
  }
  
  /**
   * Returns member's state.
   */
  public String getState() {
	  return state;
  }
  
  /**
   * Returns member's ZIP code.
   */
  public int getZip() {
	  return zip;
  }
  
  /**
   * Returns member's status.
   */
  public boolean getStatus() {
	  return status;
  }

 
}