package functional;

import java.util.Scanner;


/**
 * The Provider class is an entity class. It contains and
 * maintains the profiles of ChocAn providers.
 *
 * @author Kaylee Chase
 */

public class Provider {
	
  /**
   * The provider's name.
   */
	
  private String name; 
  
  /**
   * The provider's provider number.
   */
	
  private int providerNumber; 
  
  /**
   * The provider's street address.
   */
	
  private String address;
  
  /**
   * The provider's city.
   */
	
  private String city;
  
  /**
   * The provider's state.
   */
	
  private String state;
  
  /**
   * The provider's ZIP code.
   */
	
  private int zip;  
  
  /**
   * Boolean to represent if the provider needs to be paid.
   */
	
  private boolean status;
  
  /**
   * uses LUI promts to enter the provider's name.
   */
  private void enterName() {
      Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter provider's full name: ");
	  name = scanner.nextLine();
	  scanner.close();
  }
  
  /**
   * uses LUI promts to enter the provider's provider number.
   */
  private void enterProviderNum() {
    Scanner scanner = new Scanner(System.in);
	System.out.println("Enter provider's provider number: ");
	providerNumber = Integer.parseInt(scanner.nextLine());
	scanner.close();
  }
  
  /**
   * uses LUI promts to enter the provider's street address.
   */
  private void enterAddress() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter provider's street address: ");
	  address = scanner.nextLine();
	  scanner.close();
  }
  
  /**
   * uses LUI promts to enter the provider's city.
   */
  private void enterCity() {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter provider's city: ");
	  city = scanner.nextLine();
	  scanner.close();
  }
  
  /**
   * uses LUI promts to enter the provider's state.
   */
  private void enterState() {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter provider's state: ");
	  state = scanner.nextLine();
	  scanner.close();
  }
  
  /**
   * uses LUI promts to enter the provider's ZIP code.
   */
  private void enterZip() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter provider's ZIP code: ");
	zip = Integer.parseInt(scanner.nextLine());
	scanner.close();
  }

  /**
   * Fills in the provider profile by calling functions
   * that use command line prompts.
   */ 
  public void createProfile() {
	  enterName();
	  enterProviderNum();
	  enterAddress();
	  enterCity();
	  enterState();
	  enterZip();
    status = true;  
  }
  
  /**
   * Returns provider's name.
   */
  public String getName() {
	  return name;
  }
  
  /**
   * Returns provider's provider number.
   */
  public int getProviderNum() {
	  return providerNumber;
  }
  
  /**
   * Returns provider's street address.
   */
  public String getAddress() {
	  return address;
  }
  
  /**
   * Returns provider's city.
   */
  public String getCity() {
	  return city;
  }
  
  /**
   * Returns provider's state.
   */
  public String getState() {
	  return state;
  }
  
  /**
   * Returns provider's ZIP code.
   */
  public int getZip() {
	  return zip;
  }
  
  /**
   * Returns provider's status.
   */
  public boolean getStatus() {
	  return status;
  }

 
}