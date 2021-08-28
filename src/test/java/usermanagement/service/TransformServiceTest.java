package usermanagement.service;

import org.junit.Before;
import org.junit.Test;
import usermanagement.entity.Person;
import usermanagement.service.TransformService;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

public class TransformServiceTest {
    private static final String FNAME = "Ali";
    private static final String MNAME = "Reza";
    private static final String LNAME = "Mahdavi";
    private static final String COMPANY = "Bazaar";
    private static final int ID = 1202020;
    Person person = new Person();
    TransformService ts = new TransformService();

    @Test
    public void transform_user_domain() {
        User user = ts.toUserDomain(person);
        assertEquals(Integer.valueOf(ID), user.getUserId());
        assertEquals(FNAME, user.getFirstName());
        assertEquals(LNAME, user.getLastName());
        assertEquals(COMPANY, user.getCompanyName());
    }

    @Before
    public void setup() {
        person.setPersonId(ID);
        person.setfName(FNAME);
        person.setmName(MNAME);
        person.setlName(LNAME);
        person.setCompanyName(COMPANY);
    }
}
