package formation.addressbook.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2021-05-20T08:46:44")
@StaticMetamodel(Contact.class)
public class Contact_ { 

    public static volatile SingularAttribute<Contact, Date> birthday;
    public static volatile SingularAttribute<Contact, String> firstName;
    public static volatile SingularAttribute<Contact, String> lastName;
    public static volatile SingularAttribute<Contact, String> mobilePhone;
    public static volatile SingularAttribute<Contact, String> homePhone;
    public static volatile SingularAttribute<Contact, Long> id;
    public static volatile SingularAttribute<Contact, String> email;

}