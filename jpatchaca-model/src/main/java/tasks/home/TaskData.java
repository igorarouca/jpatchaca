package tasks.home;

import jira.JiraIssue;
import basic.NonEmptyString;

public class TaskData {

	private final String taskName;
	private Double budget;
	private String label;
	private JiraIssue jiraIssue;

	public TaskData(NonEmptyString taskName)
	{
		this.taskName = taskName.unbox();
		this.budget = 0.0;
	}	

	public final String getTaskName() {
		return taskName;
	}

	public Double getBudget() {
		return budget;
	}
	
	public String getLabel(){
		return label;
	}

	public JiraIssue getJiraIssue() {
		return jiraIssue;
	}
	
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public void setJiraIssue(JiraIssue jiraIssue) {
		this.jiraIssue = jiraIssue;
	}
}
