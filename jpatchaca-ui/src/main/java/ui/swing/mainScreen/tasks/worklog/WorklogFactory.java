package ui.swing.mainScreen.tasks.worklog;

import jira.JiraSystem;
import jira.JiraWorklogOverride;
import jira.service.Jira;
import periods.Period;
import periods.WorkingDayManager;
import tasks.TaskView;
import tasks.TasksSystem;
import basic.Formatter;

public class WorklogFactory {

    private final Jira jira;
    private final Formatter formatter;
    private final JiraWorklogOverride jiraWorklogOverride;
    private final TasksSystem tasksSystem;
    private final JiraSystem jiraSystem;
    private final WorkingDayManager workingDayManager;

    public WorklogFactory(Jira jira, Formatter formatter, JiraWorklogOverride jiraWorklogOverride,
                          TasksSystem tasksSystem, JiraSystem jiraSystem, WorkingDayManager worklogDayManager) {
        this.jira = jira;
        this.formatter = formatter;
        this.jiraWorklogOverride = jiraWorklogOverride;
        this.tasksSystem = tasksSystem;
        this.jiraSystem = jiraSystem;
        this.workingDayManager = worklogDayManager;
    }

    public Worklog newTaskWorklog(TaskView task, Period period, WorklogListModel dayTasksListModel) {
        return new Worklog(task, period, formatter, jiraWorklogOverride, tasksSystem, jira,
                jiraSystem, dayTasksListModel, workingDayManager);
    }
}
