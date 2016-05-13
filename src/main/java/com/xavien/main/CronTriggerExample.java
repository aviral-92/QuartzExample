package com.xavien.main;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

import com.xavien.readFile.ReadFile;

public class CronTriggerExample 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	/*JobDetail job = new JobDetail();
    	job.setName("dummyJobName");
    	job.setJobClass(HelloJob.class);*/
    	
    	JobDetail job1 = new JobDetail();
    	job1.setName("dummyJobName1");
    	job1.setJobClass(ReadFile.class);
    	    	
    	/*CronTrigger trigger = new CronTrigger();
    	trigger.setName("dummyTriggerName");
    	trigger.setCronExpression("0/1 * * * * ?");*/
    	
    	CronTrigger trigger1 = new CronTrigger();
    	trigger1.setName("dummyTriggerName1");
    	trigger1.setCronExpression("0/5 * * * * ?");
    	
    	//schedule it
    	/*Scheduler scheduler = new StdSchedulerFactory().getScheduler();
    	scheduler.start();
    	scheduler.scheduleJob(job, trigger);*/
    	
    	Scheduler scheduler1 = new StdSchedulerFactory().getScheduler();
    	scheduler1.start();
    	scheduler1.scheduleJob(job1, trigger1);
    
    }
}
