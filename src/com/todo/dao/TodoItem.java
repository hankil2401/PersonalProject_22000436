package com.todo.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoItem {
    private String title;
    private String desc;
    private String current_date;
    private String category;
    private String due_date;
    private String priority;
    private String rating;
    private int seasons;
    private int id;
    private int is_completed;


    public TodoItem(String title, String desc, String category, String due_date){
        this.title=title;
        this.desc=desc;
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
        this.current_date=f.format(new Date());
        this.category=category;
        this.due_date=due_date;
    }
    public TodoItem(String title, String desc, String category, String due_date, String priority, String rating, int seasons){
        this.title=title;
        this.desc=desc;
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
        this.current_date=f.format(new Date());
        this.category=category;
        this.due_date=due_date;
        this.priority=priority;
        this.rating=rating;
        this.seasons=seasons;
    }
    public TodoItem(String title, String desc, String date, String category, String due_date, int seasons){
        this.title=title;
        this.desc=desc;
        this.current_date=date;
        this.category=category;
        this.due_date=due_date;
        this.seasons=seasons;
    }
    public TodoItem(int id, String title, String desc, String date, String category, String due_date, String priority, String rating, int seasons){
    	this.id=id;
        this.title=title;
        this.desc=desc;
        this.current_date=date;
        this.category=category;
        this.due_date=due_date;
        this.priority=priority;
        this.rating=rating;
        this.seasons=seasons;
    }
    public TodoItem(int id, String title, String desc, String date, String category, 
    		String due_date, int is_completed, String priority, String rating, int seasons){
    	this.id=id;
        this.title=title;
        this.desc=desc;
        this.current_date=date;
        this.category=category;
        this.due_date=due_date;
        this.is_completed = is_completed;
        this.priority = priority;
        this.rating = rating;
        this.seasons=seasons;
    }
    
    public String toSaveString() {
    	return category + "##" + title + "##" + desc + "##" + due_date + "##" + current_date + "##" + priority + "##" + rating + "##" + is_completed+"\n";
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCurrent_date() {
        return current_date;
    }

    public void setCurrent_date(String current_date) {
        this.current_date = current_date;
    }

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDue_date() {
		return due_date;
	}
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIs_completed() {
		return is_completed;
	}
	public void setIs_completed(int is_completed) {
		this.is_completed = is_completed;
	}
	@Override
	public String toString() {
		return id + " " + "[" + category + "] " + title + " - " + desc + " - " + seasons + " - " + priority + " - " + rating  + " - " + due_date + " - " + current_date;
	}
	public String toString1() {
		return id + " " + "[" + category + "] " + title + "[V]" + " - " + desc + " - " + seasons + " - " + priority + " - " + rating  + " - " + due_date + " - " + current_date;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getSeasons() {
		return seasons;
	}
	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}
}
