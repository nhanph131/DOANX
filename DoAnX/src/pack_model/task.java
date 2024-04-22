package pack_model;

import java.time.LocalDateTime;

import enum_pack.enums.*;

public class task {
	private int task_id;
	private String taskName;
	private LocalDateTime startDateTime;
	private LocalDateTime endDateTime; 
	private String taskDescribe;
	private taskPriority taskPriority;
	private taskState taskState;
	private static int count = 11;
	
	public task() {
	}

	public task(String taskName, 
				LocalDateTime startDateTime, 
				LocalDateTime endDateTime, 
				String taskDescribe,
				taskPriority taskPriority) {
		this.taskName = taskName;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.taskDescribe = taskDescribe;
		this.taskPriority = taskPriority;
		this.task_id = count;
		count += 5;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}

	public LocalDateTime getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}

	public String getTaskDescribe() {
		return taskDescribe;
	}

	public void setTaskDescribe(String taskDescribe) {
		this.taskDescribe = taskDescribe;
	}

	public taskPriority getTaskPriority() {
		return taskPriority;
	}

	public void setTaskPriority(taskPriority taskPriority) {
		this.taskPriority = taskPriority;
	}

	public taskState getTaskState() {
		return taskState;
	}

	public void setTaskState(taskState taskState) {
		this.taskState = taskState;
	}

	public int getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	
}

