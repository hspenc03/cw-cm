import java.util.Calendar;
import java.util.Set;

import interfaces.*;
import implementations.*;

public class ContactManagerImpl implements ContactManager, Serializable {
	
	private Set<Contact> contacts;
	private Calendar date;
	
/*
 * 	@Override
 *	public int addFutureMeeting(Set<Contact>contacts, Calendar date) {
 *	}
 */

	@Override
	public PastMeeting getPastMeeting(int id){
		Meeting past = getMeeting(id);
		if (past.getDate().after(Calendar.getInstance())) {
			throw new IllegalArgumentException("This date is in the future!");
		}
		return (PastMeeting) past;
	}
	
	@Override
	public FutureMeeting getFutureMeeting(int id){
		Meeting future = getMeeting(id);
		if (future.getDate().before(Calendar.getInstance())) {
			throw new IllegalArgumentException("This date is in the past!");
		}
		return (FutureMeeting) future;
	}
	
}