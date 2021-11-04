/*******************************************************************************
 * 2014, All rights reserved.
 *******************************************************************************/
package Interfaces;

import Reservation;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Reservations.
 * 
 * @author Marcin
 */
public interface Reservations {
	// Start of user code (user defined attributes for Reservations)
	
	// End of user code
	
	/**
	 * Description of the method createTentativeReservation.
	 * @return 
	 */
	public Reservation createTentativeReservation();
	
	/**
	 * Description of the method option.
	 * @param res 
	 */
	public void option(Reservation res);
	
	/**
	 * Description of the method confirm.
	 * @param res 
	 */
	public void confirm(Reservation res);
	
	/**
	 * Description of the method cancel.
	 * @param res 
	 */
	public void cancel(Reservation res);
	
	/**
	 * Description of the method update.
	 * @param res 
	 */
	public void update(Reservation res);
	
	// Start of user code (user defined methods for Reservations)
	
	// End of user code


}
