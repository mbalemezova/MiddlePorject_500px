package photo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import comment.Comment;
import exceptions.InvalidImagePathException;
import user.User;

public class Photo {
	private static int id=1;
	
	private final int photoId;
	
	private Icon image;
	private User userUploadPhoto;
	private String description;
	private HashSet<String> keyWords;
	private String heading;
	private CopyOnWriteArraySet<User> usersLikePhoto;
	private ArrayList<Gallery> galleriesContentThisPhoto;
	private CopyOnWriteArrayList<Comment> comments;
	private double pulse;
	private int views;
	private int likes;
	private int numberOfComments;
	private String category;
	private Date uploadOfPhoto;
	

	
	//???? photoPath
	
	//BROWSE photo
	
	public Photo(String path) throws InvalidImagePathException{
		photoId=id;
		id++;
		
		//???
		if(path.isEmpty() || path==null){
			throw new  InvalidImagePathException();
		}else{
			image = new ImageIcon(path);
		}
		
		//userUploadPhoto
	}
	
	//add description to image
	public void addDescription(String description){
		this.description=description;
	}
	
	//add key words to image
	public void addKeyWord(String ... words ){
		for(String word : words){
			keyWords.add(word);
		}
	}
	
	//add heading to image
	public void addHeading(String heading){
		this.heading=heading;
	}
	
	//add user, who is liked this photo
	public void addUserLikePhoto(User liker){
		this.usersLikePhoto.add(liker);
	}
	
	//add gallery, which content this photo
	public void addGalleryContentPhoto(Gallery gallery){
		this.galleriesContentThisPhoto.add(gallery);
	}
	
	//add comments to this photo
	public void addComment(Comment newComment){
		this.comments.add(newComment);
	}
	
	//set category photo
	public void setCategory(String category){
		this.category=category;
	}
	
	//set number of comments
	public void setNumberOfComments(){
		this.numberOfComments=comments.size();
	}
	
	//set date and time of uploading photo
	public void uploadDate(){
		this.uploadOfPhoto= new Date();
	}
	
	//get date and time of uploading of the photo
	public String getUploadOfPhoto(){
		return uploadOfPhoto.toString();
	}
	
	//get number of comments
	public int getNumberOfComments(){
		return numberOfComments;
	}
	
	//get category of photo
	public String getCategory(){
		return category;
	}
	

}
