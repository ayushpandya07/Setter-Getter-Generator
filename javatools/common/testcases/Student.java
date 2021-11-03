import java.util.*;
import java.math.*;
class Batch
{
}
class Student
{
private int rollNumber;
private String firstName;
private String lastName;
private String city;
private String state;
private String country;
private int courseCode;
private Batch batch;
private Date dateOfBirth;
private BigDecimal feePaid;
private boolean isIndian;
private boolean isAdult;
private String address;
private int height;
public Student()
{
this.rollNumber=0;
this.firstName="";
this.lastName="";
this.city="";
this.state="";
this.country="";
this.courseCode=0;
this.batch=null;
this.dateOfBirth=null;
this.feePaid=null;
this.isIndian=false;
this.isAdult=false;
this.address="";
this.height=0;
}
public void setRollNumber(int rollNumber)
{
this.rollNumber=rollNumber;
}
public int getRollNumber()
{
return this.rollNumber;
}
public void setFirstName(java.lang.String firstName)
{
this.firstName=firstName;
}
public java.lang.String getFirstName()
{
return this.firstName;
}
public void setLastName(java.lang.String lastName)
{
this.lastName=lastName;
}
public java.lang.String getLastName()
{
return this.lastName;
}
public void setCity(java.lang.String city)
{
this.city=city;
}
public java.lang.String getCity()
{
return this.city;
}
public void setState(java.lang.String state)
{
this.state=state;
}
public java.lang.String getState()
{
return this.state;
}
public void setCountry(java.lang.String country)
{
this.country=country;
}
public java.lang.String getCountry()
{
return this.country;
}
public void setCourseCode(int courseCode)
{
this.courseCode=courseCode;
}
public int getCourseCode()
{
return this.courseCode;
}
public void setBatch(Batch batch)
{
this.batch=batch;
}
public Batch getBatch()
{
return this.batch;
}
public void setDateOfBirth(java.util.Date dateOfBirth)
{
this.dateOfBirth=dateOfBirth;
}
public java.util.Date getDateOfBirth()
{
return this.dateOfBirth;
}
public void setFeePaid(java.math.BigDecimal feePaid)
{
this.feePaid=feePaid;
}
public java.math.BigDecimal getFeePaid()
{
return this.feePaid;
}
public void setIsIndian(boolean isIndian)
{
this.isIndian=isIndian;
}
public boolean getIsIndian()
{
return this.isIndian;
}
public void setIsAdult(boolean isAdult)
{
this.isAdult=isAdult;
}
public boolean getIsAdult()
{
return this.isAdult;
}
public void setAddress(java.lang.String address)
{
this.address=address;
}
public java.lang.String getAddress()
{
return this.address;
}
public void setHeight(int height)
{
this.height=height;
}
public int getHeight()
{
return this.height;
}
}