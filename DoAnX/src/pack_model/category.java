package pack_model;

import java.util.List;

public class category {
	private String categoryName;
	private List<task> taskList;
	private List<user> list_users;
	private int category_id;
	private static int count = 1;
	
	public category() {
	}
	public category(String categoryName, List<task> taskList) {
		this.categoryName = categoryName;
		this.taskList = taskList;
		this.category_id = count;
		count += 3;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<task> getTaskList() {
		return taskList;
	}
	public void setTaskList(List<task> taskList) {
		this.taskList = taskList;
	}
	public void deleteTask(int index) {
		taskList.remove(index);
	}
	public void addTask(task task) {
		taskList.add(task);
	}
	public void editTask(int index, task task) {
		taskList.set(index, task);
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		category.count = count;
	}
	public List<user> getList_users() {
		return list_users;
	}
	public void setList_users(List<user> list_users) {
		this.list_users = list_users;
	}
}
