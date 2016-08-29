package user;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;

import emailvalidator.EmailValidator;
import exceptions.InvalidEmailAddressException;
import exceptions.NotSurePasswordException;
import photo.Gallery;
import photo.Photo;

public class User {
	
	private static int id=1;
	
	private final int userId;
	
	private String firstName;
	private String lastName;
	private ArrayList<Photo> post;
	private CopyOnWriteArraySet<User> followers;
	private HashSet<User> following;
	private String accountStatus;
	//private Path coverPhoto;
	//private Path profilePicture;
	private String city;
	private String country;
	private String password;
	private String email;
	private String descriptionAboutMe;
	private ArrayList<Gallery> albums;
	
	private Date birthDAy;
	
	public enum Gender {Male, Female, Not_Specified};
	//private HashSet<Group> groups;
	
	//info
	int numberOfFollowing;
	int numberOfFollowers;
	int numberOfAffection;
	int numberOfViews;
	
	private EmailValidator validator;
	
	public User(String email, String password) throws InvalidEmailAddressException, NotSurePasswordException {
		
		validator= new EmailValidator();
		
		userId=id;
		id++;

		if(!validator.validate(email)){
			throw new InvalidEmailAddressException();
		}else{
			this.email=email;
		}
		
		if(password.length()<5){
			throw new NotSurePasswordException();
		}else{
			this.password = password;
		}
		
		this.accountStatus = "free";
		
		
	}
	
	void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	void setLastName(String lastName){
		this.firstName = lastName;
	}
	
	void setCity(String city){
		this.city = city;
	}
	
	void setCountry(String country){
		this.country = country;
	}
	
	void setDescriptionAboutMe(String descriptionAboutMe){
		this.descriptionAboutMe=descriptionAboutMe;
	}
	
	public void setAccountStatus(String status){
		this.accountStatus=status;
	}
	
	public String getPasword(){
		return password;
	}
	
	public String getEmail(){
		return email;
	}
	
	public int getUserId(){
		return userId;
	}
	
	
	public void addFollowing(User user){
		following.add(user);
	}
	
	public void addFollowers(User user){
		followers.add(user);
	}
	
}
