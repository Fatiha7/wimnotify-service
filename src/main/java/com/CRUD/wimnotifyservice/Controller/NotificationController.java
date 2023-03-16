package com.CRUD.wimnotifyservice.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.wimnotifyservice.Model.Notification;
import com.CRUD.wimnotifyservice.Service.NotificationService;

@RestController()
@CrossOrigin("*")
public class NotificationController {
	@Autowired
	private NotificationService notificationservice;

	@GetMapping(value="CRUD_Notification")
	public Collection<Notification> List_Notification() {

		 return notificationservice.findAll();
		
	}
	@RequestMapping(value = "CRUD_Notification",method= RequestMethod.POST)
	public Notification add_notification(@RequestBody Notification notification) {
	
		notificationservice.save(notification);
		System.out.println("notification add ");
		return notification;
		 
	}
	@RequestMapping(value = "CRUD_Notification/{id}",method=RequestMethod.GET)
	public Notification findOne_NotificationById(@PathVariable int id) {
		return notificationservice.findone(id);
		
	}
	@RequestMapping(value = "CRUD_Notification/{id}",method=RequestMethod.PUT)
	public Notification Update_Notification(@PathVariable int id ,@RequestBody Notification notification) {
		Notification notifications=notificationservice.findone(id);
		notifications.setNotification(notification.getNotification());
		notificationservice.Update(notifications);
		return notifications;
	}

	@RequestMapping(value = "CRUD_Notification/{id}",method= RequestMethod.DELETE)
	public void Delete_Notification(@PathVariable int id) {
		notificationservice.delete(id);

		
		}
	
}
