package implementations;

import java.util.Calendar;
import java.util.Set;

import interfaces.Contact;
import interfaces.FutureMeeting;

public class FutureMeetingImpl extends MeetingImpl implements FutureMeeting{	

	public FutureMeetingImpl(Calendar date, Set<Contact> contacts){
		super(date,contacts);
	}
}
