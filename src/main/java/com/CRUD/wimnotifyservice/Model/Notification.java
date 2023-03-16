package com.CRUD.wimnotifyservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity 
public class Notification {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int ID ;
@Column(name="Notification", length=512)
private String Notification;

public Notification() {
	super();
}
public Notification(int iD, String notification) {
//	super();
	ID = iD;
	Notification = notification;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getNotification() {
	return Notification;
}
public void setNotification(String notification) {
	Notification = notification;
}

}
